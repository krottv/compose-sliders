package com.github.krottv.compose.sliders.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.github.krottv.compose.sliders.DefaultThumb
import com.github.krottv.compose.sliders.DefaultTrack
import com.github.krottv.compose.sliders.SliderValueHorizontal
import com.github.krottv.compose.sliders.ListenOnPressed

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                SlidersPresentation()
            }
        }
    }
}

@Composable
@Preview()
internal fun SlidersPresentation() {
    Column(modifier = Modifier.fillMaxWidth()) {

        var stateSlider1 by remember { mutableStateOf(0.5f) }

        Text(
            "Android Material Slider with Steps",
            modifier = Modifier.padding(horizontal = 14.dp)
                .padding(top = 20.dp)
        )
        Slider(
            stateSlider1, onValueChange = { stateSlider1 = it },
            modifier = Modifier.fillMaxWidth().height(80.dp), steps = 10
        )

        Text(
            "Custom slider with Steps that is clickable within the whole height",
            modifier = Modifier.padding(horizontal = 14.dp)
        )

        var stateSlider2 by remember { mutableStateOf(0.5f) }
        SliderValueHorizontal(
            stateSlider2, { stateSlider2 = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp), steps = 10,
            thumbHeightMax = true,
            track = { p1, p2, p3, p4, p5 -> DefaultTrack(p1, p2, p3, p4, p5, height = 4.dp) },
            thumb = { p1, p2, p3, p4, p5 ->
                DefaultThumb(
                    p1,
                    p2,
                    p3,
                    p4,
                    p5,
                    color = Color.Blue,
                    scaleOnPress = 1.3f
                )
            }
        )

        Text(
            "Custom slider with fancy design that is not clickable outside of its height",
            modifier = Modifier.padding(horizontal = 14.dp)
        )

        var stateSlider3 by remember { mutableStateOf(0.5f) }

        SliderValueHorizontal(
            stateSlider3, { stateSlider3 = it },
            modifier = Modifier
                .fillMaxWidth(),
            thumbHeightMax = false,
            track = { modifier: Modifier,
                      progress: Float,
                      _, _, _ ->

                Box(
                    Modifier.padding(vertical = 30.dp)
                        .height(8.dp).then(modifier)
                ) {
                    val bgTrack = Modifier.background(
                        Color.Magenta.copy(alpha = 0.5f),
                        RoundedCornerShape(100)
                    )

                    Spacer(bgTrack.fillMaxHeight().then(modifier))

                    val bgProgress = Modifier.background(
                        Brush.linearGradient(
                            listOf(
                                Color.Green,
                                Color.Red,
                                Color.Blue
                            )
                        ),
                        RoundedCornerShape(100)
                    )

                    Spacer(
                        bgProgress.fillMaxHeight()
                            .fillMaxWidth(fraction = progress)
                            .then(modifier)
                    )
                }
            }, thumb = { modifier, _: Dp,
                         mutableSource,
                         _, _ ->

                var isPressed by remember { mutableStateOf(false) }
                mutableSource.ListenOnPressed { isPressed = it }

                val color by animateColorAsState(
                    if (isPressed) Color.Red else Color.Yellow,
                    TweenSpec(durationMillis = 200)
                )

                Spacer(
                    modifier.background(color)
                        .border(1.dp, Color.Red)
                )

            },
            thumbSizeInDp = DpSize(60.dp, 30.dp)
        )
    }
}