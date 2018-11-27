package com.example.pbs2h17aku.prototyp_gcs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button trainingB = findViewById(R.id.trainingB);
        Button statistikB  = findViewById(R.id.statistikB);
        Button hilfeB = findViewById(R.id.hilfeB);


        trainingB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TrainingActivity.class));
            }
        });

        statistikB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,StatisticActivity.class));
            }
        });

        hilfeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HelpActivity.class));
            }
        });




    }



}
