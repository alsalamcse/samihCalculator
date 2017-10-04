package com.abbass.samih.samihcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//                                                     1.
public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNum1,etNum2;
    private Button btnPlus,btnMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        etNum1= (EditText) findViewById(R.id.etNum1);
        etNum2= (EditText) findViewById(R.id.etNum2);
        btnPlus= (Button) findViewById(R.id.btnPlus);
        btnMinus= (Button) findViewById(R.id.btnMinus);
        //3.
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);

    }

    //2.
    @Override
    public void onClick(View view)
    {
        //4.
        //to get value from the EditText field
        String stNum1=etNum1.getText().toString();
        //to convert text nuber to real number
        double num1=Double.parseDouble(stNum1);

        if(view==btnPlus)
        {
            //to react htis event
        }
        if(view==btnMinus)
        {

        }
    }
}
