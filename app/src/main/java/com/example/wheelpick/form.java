package com.example.wheelpick;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class form extends AppCompatActivity {
    private Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        next = (Button)findViewById(R.id.open);
        next.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {


                Intent intent = new Intent(form.this,about.class);
                startActivity(intent);

            }

        });
    }
};

