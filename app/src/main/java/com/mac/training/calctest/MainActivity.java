package com.mac.training.calctest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one, two, three, four, five, six, seven, eight, nine, zero, dot;
    private TextView inputText;
    private boolean dotUsed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (TextView) findViewById(R.id.inputText);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);

        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "8");
                Log.d("Activity", "8 output");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() +  "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputText.setText(inputText.getText().toString() + "0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!dotUsed) {
                    inputText.setText(inputText.getText().toString() + ".");
                    dotUsed = true;
                }
            }
        });

        dotUsed = false;
    }
}
