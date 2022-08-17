package com.example.primeiroaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("MUITO MASSA MEU PRIMEIRO PROJETO");
            }
        };
        button.setOnClickListener(listener);

    }
}