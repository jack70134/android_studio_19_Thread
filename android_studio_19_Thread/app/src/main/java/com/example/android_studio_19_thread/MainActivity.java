package com.example.android_studio_19_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.message);
        textView.setText("Got Message");
        Handler handler = new Handler();
        handler.postDelayed(runTimer, 2000);
    }
    private final Runnable runTimer = new Runnable() {
        @Override
        public void run() {
            Message msg1 = new Message();
            msg1.obj = "Got it";
            Handler handler = new Handler();
            TextView textView = (TextView)findViewById(R.id.message);
            handler.sendMessage(msg1);
            textView.setText("Got it");
        }
    };
}