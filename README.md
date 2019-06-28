![Acquire](app/src/main/res/drawable/app_icon.png)  
Acquire for Android supports API 21 and above.   
### co-browse-only-android   
Sample app for co-browse only mode Android   
### Requirements  
-------------
- Android Studio 2.2.x
- Gradle 2.2.x
- Android 7.1.1 SDK
- Android device running Android 5.0 or newer (To get fully functioning sdk)

## Installation Instructions:

### Steps to Install Acquire with all required dependencies 

Add the following dependency to your app's `build.gradle` file:
```groovy
implementation 'com.acquireio:lite:1.+'
implementation 'com.android.support:design:27.1.1'
implementation 'com.android.support:appcompat-v7:28.0.0-rc01'
implementation('io.socket:socket.io-client:1.0.0') {
   exclude group: 'org.json', module: 'json'
}
```

For our sdk you will need to add these lines to your project's `build.gradle`.
```javascript
// Add these lines to your project gradle:
   
allprojects {
    repositories {
        maven {
            url "http://107.155.116.28:8086/artifactory/libs-release-local"
        }
    }
}
```

## Setup and Configuration

* Our [installation guide](https://developers.acquire.io/android-cobrowse-sdk) contains full setup and initialisation instructions. 
* Please contact us on [Acquire](https://www.acquire.io/) with any questions you may have, we're only a message away!

## Permissions

We include the [INTERNET](http://developer.android.com/reference/android/Manifest.permission.html#INTERNET) permission by default as we need it to make network requests:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```  

## Building 
- Make sure you've installed the Android 8.0 SDK and upgraded to the latest version of Android Studio
- Make sure you've updated all support repository and Google Play Services repository packages in the Android SDK manager
- See the configuration and clone the environment into your project to run our Acquire chat sdk.

Note : _**If you are using gradle Plugin version 3.0 then use implementation instead of compile**_.         

-------------
