package com.example.alllab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab2 extends AppCompatActivity {

    EditText editName;
    TextView lab2Text;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);


        editName = findViewById(R.id.editName);
        lab2Text = findViewById(R.id.lab2Text);
        btnShow = findViewById(R.id.btnShow);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lab2Text.setText("Привет, " + editName.getText().toString() + "!");
            }
        });
    }
    public void BackActivity(View v){
        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void ShowGreeting(View v) {
        lab2Text.setText("Привет, " + editName.getText().toString() + "!");
    }
}
