package com.example.recuuf1pere;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recuuf1pere.R;

public class MainActivity extends AppCompatActivity {

    private Button btnInsertData;
    private Button btnValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.app_title);

        btnInsertData = findViewById(R.id.btn_insert_data);
        btnValidation = findViewById(R.id.btn_validation);

        btnInsertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.recuuf1pere.InsertDataActivity.class);
                startActivity(intent);
            }
        });

        btnValidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.recuuf1pere.ValidationActivity.class);
                startActivity(intent);
            }
        });
    }
}
