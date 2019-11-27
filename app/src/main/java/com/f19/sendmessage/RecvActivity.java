package com.f19.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecvActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recv);

        TextView textView = findViewById(R.id.message_txt);

        Intent intent = getIntent();
        String message = intent.getExtras().getString("message");
        textView.setText(message);
    }
}
