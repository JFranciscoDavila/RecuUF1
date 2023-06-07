package com.example.recuuf1pere;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InsertDataActivity extends AppCompatActivity {

    private EditText etField1;
    private EditText etField2;

    private EditText etField3;

    private EditText etField4;


    private Button btnSubmit;

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);

        setTitle(R.string.insert_data_title);

        etField1 = findViewById(R.id.et_field1);
        etField2 = findViewById(R.id.et_field2);
        etField3 = findViewById(R.id.et_field3);
        etField4 = findViewById(R.id.et_field4);
        btnSubmit = findViewById(R.id.btn_submit);

        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
                showToast(getString(R.string.declaration_sent_message));
            }
        });

        loadData();
    }

    private void saveData() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("field1", etField1.getText().toString());
        editor.putString("field2", etField2.getText().toString());
        editor.putString("field3", etField3.getText().toString());
        editor.putString("field4", etField4.getText().toString());
        editor.apply();
    }

    private void loadData() {
        String field1 = sharedPreferences.getString("field1", "");
        String field2 = sharedPreferences.getString("field2", "");
        String field3 = sharedPreferences.getString("field3", "");
        String field4 = sharedPreferences.getString("field4", "");

        etField1.setText(field1);
        etField2.setText(field2);
        etField3.setText(field3);
        etField4.setText(field4);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
