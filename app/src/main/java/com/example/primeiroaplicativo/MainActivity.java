package com.example.primeiroaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private Button button;
    private ArrayList<String> phrases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        phrases.add("Comprar pastel para o Professor");
        phrases.add("Comprar pizza para o Professor");
        phrases.add("Comprar nota para o Professor");



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int position = random.nextInt(phrases.size());
                String phrase = phrases.get(position);
                textView2.setText(phrase);
            }
        };
        button.setOnClickListener(listener);

    }
}