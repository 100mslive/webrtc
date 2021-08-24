# webrtc [![](https://jitpack.io/v/100mslive/webrtc.svg)](https://jitpack.io/#100mslive/webrtc)
Just a holding repo for the artefacts of webrtc builds.

The artefacts are built from https://webrtc.github.io/webrtc-org/native-code/android/ and named according to their versions in the format
libwebrtc-{platform}-{version}.aar

The current version of the webrtc project can be seen [here](https://webrtc.googlesource.com/src/+/refs/heads/main/call/version.cc#16).

To use in your own app:

Add to your root build.gradle file.

```gradle

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

And then add the dependency:

```gradle

dependencies {
	        implementation 'com.github.100mslive:webrtc:Tag'
	}

```

Look up the version from the tag above or here:
https://jitpack.io/#100mslive/webrtc#Releases