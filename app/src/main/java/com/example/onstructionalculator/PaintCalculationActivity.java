package com.example.onstructionalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PaintCalculationActivity extends AppCompatActivity {

    // поля
    private TextView output;

    private int square = 0;
    private int volume = 0;
    private int cost = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        output = findViewById(R.id.output);

        square = getIntent().getIntExtra("square", 0);
        volume = getIntent().getIntExtra("volume", 0);
        cost = getIntent().getIntExtra("cost", 0);

        output.setText("Не удалось получить данные для расчета.");

        if (square != 0 && volume != 0 && cost != 0) {
            int requiredCans = (int) Math.ceil((double) square / volume);
            int totalCost = requiredCans * cost;
            output.setText("Необходимо " + requiredCans + " банок краски\nОбщая стоимость: " + totalCost + " руб.");
        }
    }
}
