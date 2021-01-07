package com.example.wheelpick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        next = (Button)findViewById(R.id.open);
        next.setOnClickListener(new View.OnClickListener() {


        }
    }
}