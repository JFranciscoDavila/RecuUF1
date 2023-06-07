package com.example.recuuf1pere;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ValidationActivity extends AppCompatActivity {

    private TextView tvField1;
    private TextView tvField2;

    private TextView tvField3;

    private TextView tvField4;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);

        setTitle(R.string.validation_title);

        tvField1 = findViewById(R.id.tv_field1);
        tvField2 = findViewById(R.id.tv_field2);
        tvField3 = findViewById(R.id.tv_field3);
        tvField4 = findViewById(R.id.tv_field4);

        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);

        loadData();
    }

    private void loadData() {
        String field1 = sharedPreferences.getString("field1", "");
        String field2 = sharedPreferences.getString("field2", "");
        String field3 = sharedPreferences.getString("field3", "");
        String field4 = sharedPreferences.getString("field4", "");

        tvField1.setText(getString(R.string.field1_label) + ": " + field1);
        tvField2.setText(getString(R.string.field2_label) + ": " + field2);
        tvField3.setText(getString(R.string.field3_label) + ": " + field2);
        tvField4.setText(getString(R.string.field4_label) + ": " + field2);
    }
}
