Change Log
==========

## Version 0.1

_2021-11-18
Initial release of Slider

## Version 5.2

_2021-11-06
1. Black Friday!
2. Better palette cancellation

## Version 5.1

_2021-10-28
1. Halloween templates and stickers
2. Coil instead of glide

## Version 5.0

_2021-10-05
1. Add notification for remove back
2. A lot of fixes for remove back templates

## Version 5.0-RC

_2021-10-02
1. Remove BG instrument
2. Remove BG templates
3. OpenGL Masks abstractions
4. Pack asset resources to ios, test serialization
5. Fixes for Android 12

## Version 4.4 - bugfix

_2021-09-16
1. all_inclusive_license user property
2. Firebase A/B tests with amplitude
3. selectedVideo.videoVolume is null
4. videoCodec?.signalEndOfInputStream() - wrap with try catch
5. Check lifecycleState in OnBoardingActivity.onPlayerError
6. Update moko-permissions to 0.10.2 and kotlin to 1.5.30
7. revert onboarding videos
8. Fix position of selected color in colors instruments panel

## Version 4.3

_2021-09-10

New features 
1. New onboarding with quiz
2. 2 new social templates

Bugfixes:
1. Remove image size if we are gonna apply blur
2. Sort my stories by date
3. Improve timeout time in ktor plus don't close MyMusicAct on error
4. Sort files in gallery by modified date
5. Social text fixes
6. Fix vhs template trim panel


Refactor:
1. alignBy instead of Gravity
2. otf fonts support
3. Move all available classes to shared lib
4. Make templateView abstract class


## Version 4.2 - bugfix

_2021-08-15

1. New splash screen
2. RateUsDialog text fix
3. Multiplatform asset loader for templates
4. Google Play in app update fix crash
5. Remove changed duration on preview
6. Beauty2 fix layers order
7. Fix black opengl textures before render
8. Fix correctly notify change of WeeklyFreeTemplates
9. VHS templates on preview
10. Fix laggs when moving video inside a mask
11. Onboarding finished event
12. Subscribe activity fix display with less than 2 buttons
13. Beauty1 fix clip effect.
14. Fix: opengl add photo to a texture.

## Version 4.1 - major release

_2021-08-05

1. New art templates
2. Different color filter modes 
3. Fonts for IOS
4. Google Play in app update fix crash
5. Refactor rateUsDialog
6. Notification about unfinished story
7. Notification about weekly free templates
8. Fixed update push notifications
9. Fix animation in blank templates
10. Add no animation text style.
11. Github actions

## Version 3.1

_2021-07-06

1. On click select only text without parent
2. Text is cutted in happy new year templates
3. При добавлении видео некоторые шаблоны уходят в постоянную загрузку на превью и рендере
4. Wrap audioMixer initialization in try catch and toast non critical errors
5. NaN in translation - debug it
6. ErrorHandler KMM component
7. Crash when musicPlayer is non null in templateView
8. Single method for get available pages for video to prevent possible logic issues
9. Multiline break issue
10. Green lines in templates
11. Reset palette when change bg of InspMediaView
12. Trouble when selecting socialIcon


## Version 3.0

_2021-06-30

### Major changes

* 4 Social Templates
* Ability to control volume of video and add it to final rendering
* Swipe Up and Social text styles
* Huge refactor of InspViews to make it KMM

### Bugfixes

* Improve blank templates - display placeholder instead of solid gray.
* Correct initial rotation and fix rotation lags
* New Rate us Dialog with A/B test
* Add orientation to group: H, V, Z
* Improve downloading dialog in MusicLibrary - use Dialog composable
* Remove video trimmer library
* Fix endless loading if insert more than 1 video
* Refactor Panels UI logic in EditActivity
* If template is loading pressing one time should be enough to exit
* In palette bug with opacity
* Fix crash when copying InspViews
* Play video with exoPlayer basic in Preview mode
* Removed liveData dependency
* Waveform index out of bound fix
* Fix palette doesn’t work properly in Before/After templates and some others
* RelativeToParent attribute for layoutPosition
* Don’t add empty textView when click on text. Because it looks odd
* Fix ref leak in inspView with deep InspGroupView when removeView
* Remove InspGroupView if it has no children
* Just like textView make InspVectorView invisible before startTime
* Move borderView on playback
* New attribute move animator relativeToSelf
* Improve loopedAnimationInterval attribute: make out anim when the whole view is done

## Version 2.4

_2021-05-07

* Timeline can’t play video in blank template
* FIX Critical issue on Huawei devices when video renders as black. Just added a delay before
  copying original video from private files folder. Seems like writing was still in process, but it
  is a very weird since writing should be blocking.
* A little bit improved premium icon in tabs
* Can’t change gradient with white to simply white color
* Remove bg color for text and also if it is a vector
* Formats dialog refactor
* onboarding is not seen on first start + make statusbar white.

## Version 2.3

_2021-05-01

* Improve architecture of SubscribeActivity to easily switch payment providers and easily switch UI
* Amplitude with adapty proper integration
* Log error about can’t load a template
* Animator leak in subscribe activity
* Stop rendering correctly
* try catch in encoders
* remove require in TrimmingVideo lib and fix MediaMetadataRetriever leaks
* Crash in fontDialog on rotation
* Replace eventBus with mutableStateFlow

## Version 2.2

_2021-04-21

* Fix whenTemplateInitializedBug

## Version 2.1

_2021-04-20

* Fix shadow for square templates
* Inspiry - no border when text is selected in blank template
* Adapty push notifications for churn subscribers

## Version 2.0

_2021-04-16

### Major changes

* Added stickers library
* Music is almost done for ios with kotlin multiplatform
* Create new category BLANK
* 3 new text brush animations

### Bugfixes

* Crash when selecting video for backgroundView
* Template parent is null in InspVectorView onResourceLoaded
* resultViewIndex is outOfBounds on matisseResult
* bufferInfo must specify a valid buffer offset, size and presentation time in AudioEncoder
* Remove predefined image from some templates (vogue, blank)
* Facebook analytics only specific events
* Fix edit activity shadow
* duplicated sticker is under, but on preview everything is ok

## Version 0.9.5

_2021-04-02

* Backend for stickers (only in debug)
* New text styles Brush
* Fonts don’t support changing case
* Remove gradient option from bg if it is a vector
* Don’t change text color if it has background when we add it to a template
* When we return from preview - movableView is selected but no panel is visible
* Alpha doesn't work if not color is set before.
* Change video total duration on view duration change
* Still endless loading of video sometimes with duplicates
* Properly delete textureView resources
* Rotation is reset when we return to the video
* TrimActivity video has wrong aspect ratio (because of rotation)
* Image gallery low image quality + don't load on some devices
* Make that text bg is applied to a sticker.
* Music - show cache if no internet is available
* Updated jetpack compose which fixes AndroidView scroll bug

## Version 0.9.4

_2021-03-19

* Better mont font
* Send feedback to our email from Rating dialog
* support email in remote config

## Version 0.9.3

_2021-03-18

* Template is not saved to my stories if I click export (or not available instantly)
* Text has unnecessary clippings on huawei + video sometimes has no clipping
* Music doesn’t render on some devices (wrong codec format)
* Playing time is wrong in waveform
* Fix display of a waveform if template duration is more than music
* Border is black but text is white when we first add the text to a BlankGridTemplate
* Text disappears on rendering on Huawei and on resize
* Fix concurrentModificationException in AnimationHelper.kt

## Version 0.9.2

_2021-03-16

* Fix waveform empty can’t be scrolled
* Fix m4a files waveform
* Updated font dialog

## Version 0.9.0

_2021-03-12

### Major changes

* Music library

### Minor changes

* Use flow instead of PlayingThread for playback of template
* Endless loading if add multiple videos
* Video is not playing until the end. Only 3 seconds - girl with flowers template
* Increase resulting video bitrate 1.5x
* Image rendered as black and also quality is lost
* Can’t upload font, To pick font allow choosing any file
* Multiplatform settings with di
* Class not found when unmarshalling
* Get paywall name from FirebaseRemoteConfig

## Bugfix version 0.8.5

_2021-03-02

* Fix bug that images didn't load in gallery
* Fix bug with capture in matisse

## Bugfix version 0.8.4

_2021-02-27

* A little fix for sliding love template
* Color picker bind to lifecycle
* Lag when scroll to new year templates
* Bug with rotation display when text has parent
* Fix bug with 100% discount on russian prices
* This version has remote config option free_cause_payments_failed which makes inspiry free for use
  and show_dialog_free_cause_payments_failed for dialogs

## Bugfix version 0.8.1

_2021-02-20

* Remove touch InspMediaView when alpha is 0
* Crash when we set new position for trim video
* Crash in DeferredProgramCreator
* Fix crash in my stories

## Version 0.8.0

_2021-02-19

### Major changes

* Category with love templates (not all of them)
* Migrated to Kotlin serialize

### Minor changes

* Fix sharing issue on android 11
* Bug when click on an element to change color when timeline is opened
* Don’t display demo image on preview, only in list
* Lazy loading of templates in adapter
* Don’t hide depends text parent, or hide based on its start time, because it can start earlier
* MediaText: shadowOffsetX and Y can be set independently
* Tooltip for layers panel
* LoopedAnimationInterval for lottie
* FirebaseStorage integration with Glide
* Ability to make transparent openGL TextureView!
* Add padding to square format on save

## Version 0.7.2

_2021-02-14

* New onBoarding screen
* Tight integration with Adapty
* Prepared arch for music. Music is played and rendered to a template

* Add scale-fade animation when we select view for border
* fix crash when swap texViews wrapped in groups
* isChanged - true when change lottie color

## Version 0.7.0

_2021-01-31

* Category NEW to showcase new templates from different categories
* New category Beauty with 6 templates
* New business coffee template and fixes for some others
* Add font replacements for cyrillic fonts
* Fix for keyboard appearing
* Ability to change color of a single movable element
* Fix opengl bug with texture transparency
* Use outline to round corners of all views, so we can use it in lottie

## Version 0.6.0

_2021-01-21

* Lottie integration to play vector animations
* Ability to move, rotate, delete, copy and change size of little images in templates
* New type of border which will solve problems with overlays
* Improved control in StepDecoderPlayer
* Changed OpenGl architecture, so we don't receive crash if we have duplicated videos
* Final rendering speed is improved on OpenGl templates
* Video insertion without trimming it to save user time
* Ability to add multiple template textures
* New templates: InstaShop3Items animation, New paper templates with multiple textures,
  ChBlurredDuplicate add blur and remove duplicate, New business template
* Correct matrix when rotate video
* Fix text border color again
* Crash in rotateGestureDetector
* Resize program textures when needed
* Removed branch integration as it proved itself useless

## Version 0.5.1

_2020-12-24

* New year templates and new fonts
* Fixed portuguese translation
* Animate the last minimal template
* Replace FadeLayout with char by char animation to fix gradient shader bug
* Make all static templates free
* Clipping of parent stopped working
* Image disappeared when applying circularClipping
* New before after template
* Run Free for week independently
* Fix possible crashes in textGradient and text bg gradient

## Version 0.4.1

_2020-12-19

* Revert palette + image
* Add events for facebook
* More free fonts.
* Added glowBlink text style
* Apply caps mode when picking style in TextAnimationActivity
* Text is visible if template is not event initialized yet
* Don't unselect text on opening timeline
* Set gradient as lines plus GradientOrientation for texts.
* Sometimes chars disappear when we change text size. Clip animation needs to be invoked again! (
  invalidate will fix that)
* Animation for the other 1 minimal template - girl with flowers.
* Circular animation is broken
* Path gradient as for color and maybe use object for textGradientColor as it is better
* Path border is not visible when we first add it
* Common interpolator for InspPath
* Ability to rotate image inside a frame
* Add animation to gradient static template
* Can't delete image if it was set as background

## Version 0.4.0

_2020-12-10

* Palette tool
* Make possible adding animations to static templates
* Timeline text can go out of bounds
* keyboard when timeline is opened conflict
* Change scale and move inner images when timeline is opened.
* Surface rendering for all templates (greatly improved speed)
* Move Trends template line with text and only by Y
* Enable scroll bars in FontsDialog and TextColorDialog
* Center texts vertically in container
* text wrong timing when we first add it (twoPaperTemplate)
* Migrate to data binding and kotlin 1.4.20
* Center guidelines for text
* Animations for static grid templates. Now all grid templates are animated
* Ability to save video templates as images (Not stable yet)
* Fix requested duration for trimming videos
* Remove save_template from analytics, palette_changed new event
* Circular animation for 3 round minimal template
* New gradient template Black Friday
* Ability to set gradient for text bg or foreground
* Add dialog for feedback in MyStories
* Export image or video choice after click share
* Improved saving logic when user presses back. Show dialog and also autosave on silent exit.
* If text has some border, apply color on change to it too.

## Version 0.3.1

_2020-11-22_

* Qonversion 2.0 plus additional fixes for branch analytics

## Version 0.3.0

_2020-11-15_

* Simple template with background/without background and text
* Don't send amplitude events in debug
* add new Firebase only event - send notification free for a week
* Halloween after minimal + remove icon in categories
* Change of format
* fading_layout doesn't work well with background
* Subscribe screen improvements
* Google Play review update replaced with custom dialog