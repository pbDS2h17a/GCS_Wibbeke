package com.example.pbs2h17aku.prototyp_gcs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class TrainingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        Patient p = new Patient();

        final EditText number = findViewById(R.id.userInputNumber);

        final TextView copyNumber = findViewById(R.id.copyUserInput);

        Button losB = findViewById(R.id.losB);

        losB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(number.getText()==p.gzsValue()){
                    copyNumber.setText("true");
                }
                else{
                    copyNumber.setText("false");
                }
            }
        });
        final TextView timerTraining= findViewById(R.id.timerTraining);


    }



}
