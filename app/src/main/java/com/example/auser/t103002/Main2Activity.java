package com.example.auser.t103002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onOne (View v) {
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void onTwo (View v) {
        Intent intent = new Intent(Main2Activity.this, FireChat.class);
        startActivity(intent);
    }

    public void onThree (View v) {
        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
    }
}
