package com.example.acquire_android.cobrowseonlyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.acquireio.AcquireApp;
import com.acquireio.callbacks.OnCoBrowseEvent;
import com.acquireio.callbacks.OnSessionEvents;
import com.acquireio.sdk.enums.CallType;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements OnSessionEvents, OnCoBrowseEvent{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AcquireApp.getInstance().setSessionListner(this);
        AcquireApp.getInstance().setCoBrowseSessionListner(this);
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

    @Override
    public void onCoBrowseConnect(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Our Co browse id "+ s , Toast.LENGTH_SHORT).show();
            }
        });
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
}
