package com.abbass.samih.samihcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//                                                     1.
public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNum1,etNum2,etResult;
    private TextView tvOp;
    private Button btnPlus,btnMinus,
                    btnMul,btnDiv,
                    btnPower,btnCumpute,
                    btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);

        etNum1= (EditText) findViewById(R.id.etNum1);
        etNum2= (EditText) findViewById(R.id.etNum2);
        etResult=(EditText) findViewById(R.id.etResult);
        tvOp=(TextView)findViewById(R.id.tvOp);
        btnPlus= (Button) findViewById(R.id.btnPlus);
        btnMinus= (Button) findViewById(R.id.btnMinus);
        btnMul= (Button) findViewById(R.id.btnMul);
        btnDiv= (Button) findViewById(R.id.btnDiv);
        btnPower= (Button) findViewById(R.id.btnPower);
        btnCumpute= (Button) findViewById(R.id.btnCompute);
        btnClear= (Button) findViewById(R.id.btnClear);


        //3.
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnPower.setOnClickListener(this);
        btnCumpute.setOnClickListener(this);
        btnClear.setOnClickListener(this);


    }

    //2. alt enter
    @Override
    public void onClick(View view)
    {
        //4.
        //to get value from the EditText field
        String stNum1=etNum1.getText().toString();
        String stNum2=etNum2.getText().toString();
        //to convert text nuber to real number
        double num1=Double.parseDouble(stNum1);
        double num2=Double.parseDouble(stNum2);

        if(view==btnPlus)
        {
            //to react this event
        }
        if(view==btnMinus)
        {

        }
        if(view==btnMul)
        {

        }
        if(view==btnDiv)
        {

        }
        if(view==btnPower)
        {

        }
        if(view==btnCumpute)
        {

        }
        if(view==btnClear)
        {

        }
    }
}
