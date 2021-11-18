package com.github.krottv.compose.sliders.sample

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.krottv.compose.sliders.sample.SlidersPresentation

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ComposeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun printSemantics() {
        // Start the app
        composeTestRule.setContent {
            SlidersPresentation()
        }
        // Log the full semantics tree
        composeTestRule.onRoot().printToLog("compose-tag")
    }
}