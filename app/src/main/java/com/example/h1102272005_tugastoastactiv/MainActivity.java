package com.example.h1102272005_tugastoastactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int naik = 5;
    Button toast, countup, countdown;
    TextView _txtlima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast = (Button) findViewById(R.id.btn_toast);
        countup = (Button) findViewById(R.id.btn_countup);
        countdown = (Button) findViewById(R.id.btn_countdown);
        _txtlima = (TextView) findViewById(R.id.txtlima);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Ivan Taufiq", Toast.LENGTH_SHORT).show();
            }
        });

        countup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik++;
                _txtlima.setText(Integer.toString(naik));
            }
        });

        countdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik--;
                _txtlima.setText(Integer.toString(naik));

            }
        });
    }
}
