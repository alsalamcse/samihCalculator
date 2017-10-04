package com.abbass.samih.samihcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainCalcActivity extends AppCompatActivity {

    private EditText etNum1,edtNum2;
    private Button btnPlus,btnMinois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);
        //kjhjkhsdhk
        etNum1= (EditText) findViewById(R.id.etNum1);
    }
}
