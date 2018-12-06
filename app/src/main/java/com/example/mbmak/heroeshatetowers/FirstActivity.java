package com.example.mbmak.heroeshatetowers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView Heading;
    Button startButton;
    Button endButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        startButton = (Button) findViewById(R.id.Start);
        endButton = (Button) findViewById(R.id.Leave);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 0;
                int b = 10 / a;
            }
        });


    }
}
