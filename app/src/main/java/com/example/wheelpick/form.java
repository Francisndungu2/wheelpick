package com.example.wheelpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        next = (Button)findViewById(R.id.open);
        next.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {


                Intent intent = new Intent(form.this, about.class);
                startActivity(intent);

            }

        });
        }
    }
