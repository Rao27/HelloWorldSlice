# HelloWorldSlice

Created a demo for Android Slices components:

Prerequisites: 
1. You will need Slicer View Sample apk. You can get apk from:
https://github.com/googlesamples/android-SliceViewer/releases/download/1.0.0-alpha1/slice-viewer.apk
2. To install it run following command:
adb install -r -t slice-viewer.apk

To Test Slice:
1. Clone this repo
2. Run HelloWorldSlice app
3. Run following commands in either terminal
4. adb shell am start -a android.intent.action.VIEW -d slice-"com.rao27.helloworldslice/helloworld"

PS:  I have followed following tutorial for this repository:
https://proandroiddev.com/android-jetpack-android-slices-introduction-cf0ce0f3e885
