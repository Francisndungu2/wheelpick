package com.example.wheelpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button backs = (Button) findViewById(R.id.backs);
        about.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(about.this, form.class);
                startActivity(intent);

            }

        });
    }

    static void setOnClickListener(View.OnClickListener onClickListener) {

    }
};
