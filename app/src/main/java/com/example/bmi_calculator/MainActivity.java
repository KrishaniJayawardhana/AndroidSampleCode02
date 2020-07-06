package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button cal1;
    TextView W,H,R1,R2;
    EditText EW,EH;

    float EntWeight,EntHeight,Results1,Results2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal1=findViewById(R.id.cal);
        W=findViewById(R.id.weight1);
        H=findViewById(R.id.hight);
        R1=findViewById(R.id.result1);
        R2=findViewById(R.id.result2);
        EW=findViewById(R.id.enterW);
        EH=findViewById(R.id.enterH);

        cal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EntWeight=Float.parseFloat(EW.getText().toString());
                EntHeight=Float.parseFloat(EH.getText().toString());

                Results1=EntWeight/(EntHeight*EntHeight);
                R1.setText(String.valueOf(Results1));

                    if(Results1>=25){
                        R2.setText("FAT PERSON");
                    }
                    else if(Results1<18){
                        R2.setText("THIN PERSON");
                    }
                    else{
                        R2.setText("NORMAL PERSON");
                    }


            }
        });

    }
}
