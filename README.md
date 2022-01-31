# webrtc [![](https://jitpack.io/v/100mslive/webrtc.svg)](https://jitpack.io/#100mslive/webrtc)
Just a holding repo for the artefacts of webrtc builds.

Why's the version name so long? It's taken from [call/versions.cc](https://chromium.googlesource.com/external/webrtc/+/refs/heads/master/call/version.cc#16) in the WebRTC source. They version by date.
Release versions are named after their [release name m94]-[branch name] for example m94-4606, the branch is the one corresponding to the one for the particular release as seen in chrome release notes for [example](https://groups.google.com/g/discuss-webrtc/c/tFyWdqW2sQM).

The artefacts are built from https://webrtc.github.io/webrtc-org/native-code/android/.

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
	        implementation 'com.github.100mslive:webrtc:m97'
	}

```

Look up the version from the tag above or here:
https://jitpack.io/#100mslive/webrtc#Releases


# Repository licence
The license of the repository is in LICENCE

# Webrtc licence
The webrtc licence is in LICENCE.md
