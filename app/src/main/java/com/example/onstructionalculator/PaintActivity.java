package com.example.onstructionalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaintActivity extends AppCompatActivity {

    // Поля
    private EditText editSquare;
    private EditText editVolume, editCost;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);

        editSquare = findViewById(R.id.editSquare);
        editVolume = findViewById(R.id.editVolume);
        editCost = findViewById(R.id.editCost);
        buttonCalculate = findViewById(R.id.buttonCalculate);


        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    String squareStr = editSquare.getText().toString();
                    String volumeStr = editVolume.getText().toString();
                    String costStr = editCost.getText().toString();

                    // Проверка на заполненность всех полей
                    if (!squareStr.isEmpty() && !volumeStr.isEmpty() && !costStr.isEmpty()) {
                        int square = Integer.parseInt(squareStr);
                        int volume = Integer.parseInt(volumeStr);
                        int cost = Integer.parseInt(costStr);

                        Intent intent = new Intent(getApplicationContext(), PaintCalculationActivity.class);
                        intent.putExtra("square", square);
                        intent.putExtra("volume", volume);
                        intent.putExtra("cost", cost);
                        startActivity(intent);
                    } else {

                    }
                } catch (NumberFormatException e) {
                    Log.e("PaintActivity", "Ошибка при преобразовании строки в число: " + e.getMessage());
                } catch (Exception e) {
                    Log.e("PaintActivity", "Произошла ошибка: " + e.getMessage());
                }
            }
        });

    }
}
