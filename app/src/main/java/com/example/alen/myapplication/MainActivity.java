package com.example.alen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etDividend;
    EditText etDivisor;
    Button bBerechne;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Operanden Inputtextfelder zuordnen
        etDividend = (EditText) findViewById(R.id.dividendInput);
        etDivisor = (EditText) findViewById(R.id.divisorInput);
        //Button zuordnen
        bBerechne = (Button) findViewById(R.id.button);
        //Ergebnis Outputtextfeld zuordnen
        tvOutput = (TextView) findViewById(R.id.ergebnisOutput);

        bBerechne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float dividend = Float.parseFloat(etDividend.getText().toString());
                    float divisor = Float.parseFloat(etDivisor.getText().toString());
                    float ergebnis = dividend / divisor;
                    tvOutput.setText(Float.toString(ergebnis));
                }  catch (Exception e) {
                    tvOutput.setText("Werte eingeben!!!");
                }
            }
        });
    }
}
