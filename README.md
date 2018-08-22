# co-browse-only-android
Sample app for co-browse only mode Android
First of all you will need to add our maven link to your project gradle file.


allprojects {
    repositories {
        maven {
            // Add this line 
            url "http://107.155.116.28:8086/artifactory/libs-release-local"
        }
    }
}

You need to add following dependencies to your app level gradle file :

If co browse only mode is activated in your account then you can use our specific android-sdk version for it.


implementation 'com.acquireio:cobrowse_only:1.+'*
implementation 'com.android.support:design:27.1.1'
implementation 'com.android.support:appcompat-v7:28.0.0-rc01'
implementation('io.socket:socket.io-client:1.0.0') {
   exclude group: 'org.json', module: 'json'
}

Initialization of the sdk is same as normal integration.

Follow this steps for this.

After initialization you can use both events callbacks :

OnSessionEvents And
OnCoBrowseEvent
From OnSessionEvents , you can start co-browsing by calling AcquireApp.getInstance().startSupportChat(); Within onSessionConnected()

For Cobrowse only mode you will get below callback events by setting up OnCoBrowseEvent listener. Use method AcquireApp.getInstance().setCoBrowseSessionListner(this);

To register listener.

Here is the complete understanding of these callbacks:

onCoBrowseConnect(String s) : Will be invoked when co browse session is connected and also you can get random id from its argument.
onAgentConnected() : This is invoked when agent start connection by entering same random id which user has got.
onCoBrowseDisconnect(String name) : this method is invoked when co browsing session is disconnected. Also it will tell you who (agent/user) has disconnected the session.
onCoBrowseFailed() : will be invoked when socket connection fails to connect.
onCoBrowseError() : will be invoked when socket gives any error while running session.
* Note: You can not use video/audio calling feature with this sdk version.
So if you are still using any calling related api then it may result in a app crash.

Here are some useful methods for co-browse mode:
setCoBrowseSessionListner(OnCoBrowseEvent coBrowseEventListner): Use this method to set listener for co browse events.
addMaskingView(View view) : Use this method to add a mask to any view for user privacy.
setMaskingViewColor(int color) : Use this method to set masking color.
removeMaskingView(View view): Remove view from masking views list.
promptCoBrowseDisconnect(boolean b): pass true/false based on your requirement to show alret for termination of co browsing session.By default it is set to true.
endCoBrowseSession(): Call this method to end the current co browse session.
setMouseIcon(int resourceId): Pass the resource id in this method to override mouse icon.
logOut(): To flush out all acquire components call this method.But keep in mind , after calling logout no api of our sdk will work.
