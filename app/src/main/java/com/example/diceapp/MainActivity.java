package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollDiceButton;
    private Random numberGenerator;
    private ImageView diceImageOne;
    private ImageView diceImageTwo;
    private int[] diceImages={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceImageOne = findViewById(R.id.diceOne);
        diceImageTwo = findViewById(R.id.diceTwo);
        rollDiceButton = findViewById(R.id.rollTheDiceButton);
        numberGenerator = new Random();
        rollDiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int iCount = 0; iCount < 6; iCount++) {
                    //Generate random number and  set dice image
                    int randomNumber = numberGenerator.nextInt(6);
                   diceImageOne.setImageResource(diceImages[randomNumber]);
                    randomNumber = numberGenerator.nextInt(6);
                    diceImageTwo.setImageResource(diceImages[randomNumber]);
                }

            }
        });
    }
}
