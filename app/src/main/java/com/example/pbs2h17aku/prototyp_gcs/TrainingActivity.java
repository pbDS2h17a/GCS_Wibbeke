package com.example.pbs2h17aku.prototyp_gcs;

import android.app.Activity;
import android.os.Bundle;
import android.os.DropBoxManager;
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

        //Ein Patient wird erstellt
        Patient p = new Patient();

        //Der Wert wird in einem Int gespeichert um diesen zu Übernehmen
        final int value = p.gzsValue();

        //Das Editfeld wo die Zahl eingegeben wird
        final EditText number = findViewById(R.id.userInputNumber);

        //Das Textfeld wo das ergebnis reinkommt
        final TextView copyNumber = findViewById(R.id.copyUserInput);

        Button losB = findViewById(R.id.losB);

        //Reagiert bei click auf "LOS" und sendet das Ergebnis an das copyTextfeld
        losB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(number.getEditableText().equals(value)){
                    copyNumber.setText("true");
                }
                else{
                    copyNumber.setText("false");
                }
            }
        });



    }



}
