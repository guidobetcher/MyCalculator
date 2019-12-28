package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private String calculo;
private double res;
private String operator;
final TextView operacion = findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonSin = findViewById(R.id.buttonSin);
        buttonSin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operator = "sin";
                operacion.setText(operacion + operator);
            }
        });
        final Button buttonCos = findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operator = "cos";
                operacion.setText(operacion + operator);
            }
        });
        final Button buttonx = findViewById(R.id.buttonx);
        buttonx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operator = "x";
                operacion.setText(operacion + operator);
            }
        });
        final Button buttonAC = findViewById(R.id.buttonAC);
        buttonAC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operacion.setText("");
                operator = null;
                res = 0;
            }
        });
        final Button buttonTan = findViewById(R.id.buttonTan);
        buttonTan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operator = "tan";
                operacion.setText(operacion + operator);
            }
        });
        final Button buttonDiv = findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operator = "-";
                operacion.setText(operacion + operator);
            }
        });
        final Button buttonSum = findViewById(R.id.buttonSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operator = "/";
                operacion.setText(operacion + operator);
            }
        });
        final Button buttonMin = findViewById(R.id.buttonMin);
        buttonMin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                operator = "-";
                operacion.setText(operacion + operator);
            }
        });
        final Button buttonIgual = findViewById(R.id.buttonIgual);
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                operacion.setText(Double.toString(res));
            }
        });
        final Button button0 = findViewById(R.id.button0);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (operator.equals("")) {
                    res = 0;
                }
                res = Math.cos(res);
                operacion.setText(Double.toString(res));
            }
        });
        final Button buttonCos = findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                res = Math.cos(res);
                operacion.setText(Double.toString(res));
            }
        });
        final Button buttonCos = findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                res = Math.cos(res);
                operacion.setText(Double.toString(res));
            }
        });
        final Button buttonCos = findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                res = Math.cos(res);
                operacion.setText(Double.toString(res));
            }
        });
    }
}
