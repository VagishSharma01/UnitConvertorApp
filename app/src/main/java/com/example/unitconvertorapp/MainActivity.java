package com.example.unitconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
            private Button button;
            private TextView textView4;
            private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        textView4 = findViewById(R.id.textView4);
        editText = findViewById(R.id.EditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi, Click listener worked!", Toast.LENGTH_SHORT).show();
                String s =  editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = kg*2.205;
                textView4.setText(" "+ pound);
                textView4.setTextSize(25);
            }
        });
    }
}