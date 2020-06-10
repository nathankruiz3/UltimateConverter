package com.nathankruiz3.ultimateconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TeaspoonsToCups extends AppCompatActivity {

    private EditText teaspoonsEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teaspoons_to_cups);

        teaspoonsEditText = (EditText) findViewById(R.id.teaspoonsEditText);
        convertButton = (Button) findViewById(R.id.convertButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplier = .020833;
                double result = 0.0;

                if (teaspoonsEditText.getText().toString().equals("")) {
                    Toast.makeText(TeaspoonsToCups.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }else {
                    double enteredMeters = Double.parseDouble(teaspoonsEditText.getText().toString());
                    result = multiplier*enteredMeters;
                    resultTextView.setText(String.format("%.4f", result) + " cups");
                }
            }
        });
    }
}