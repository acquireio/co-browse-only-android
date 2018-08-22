package com.example.acquire_android.cobrowseonly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.acquireio.AcquireApp;
import com.acquireio.callbacks.OnCoBrowseEvent;
import com.acquireio.callbacks.OnSessionEvents;
import com.acquireio.sdk.enums.CallType;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements OnSessionEvents, OnCoBrowseEvent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AcquireApp.getInstance().setSessionListner(this);
        AcquireApp.getInstance().setCoBrowseSessionListner(this);
    }

    @Override
    public void onCoBrowseConnect(String s) {
        Log.d("log_tag", "Co browse session id " + s);
    }

    @Override
    public void onAgentConnected() {

    }

    @Override
    public void onCoBrowseDisconnect(String s) {

    }

    @Override
    public void onCoBrowseFailed() {

    }

    @Override
    public void onCoBrowseError() {

    }

    @Override
    public void onSessionConnected() {
        AcquireApp.getInstance().startSupportChat();
    }

    @Override
    public void onSessionDisconnected(String s) {

    }

    @Override
    public void onAgentOnline() {

    }

    @Override
    public void onAgentOffline() {

    }

    @Override
    public void onAgentAvailable() {

    }

    @Override
    public void onCallConnected(CallType callType) {

    }

    @Override
    public void onCallDIsconnected(CallType callType) {

    }

    @Override
    public void callDisconnectWithReason(String s) {

    }

    @Override
    public void onTriggerEvent(String s) {

    }

    @Override
    public void onChatClosed() {

    }

    @Override
    public void onChatWidgetClose() {

    }

    @Override
    public void onTagChange(JSONObject jsonObject) {

    }
}
