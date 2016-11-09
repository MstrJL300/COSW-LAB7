package com.example.jose.calculadora;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText etNum1;
    EditText etNum2;

    Button btnAdd, btnSub, btnMult, btnDiv, btnPoint, btnEnt, btnC, btnElv2,
            btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    TextView tvResult;

    String oper = "";

    float num1 = 0;
    float num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the elements
        etNum1 = (EditText) findViewById(R.id.etNum1);  etNum2 = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);    btnSub = (Button) findViewById(R.id.btnSub);      btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);    btnPoint = (Button) findViewById(R.id.btnPoint);  btnEnt = (Button) findViewById(R.id.btnEnt);
        btnC = (Button) findViewById(R.id.btnC);        btnElv2 = (Button) findViewById(R.id.btnElv2);

        btn0 = (Button) findViewById(R.id.btn0);    btn1 = (Button) findViewById(R.id.btn1);    btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);    btn4 = (Button) findViewById(R.id.btn4);    btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);    btn7 = (Button) findViewById(R.id.btn7);    btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        tvResult = (TextView) findViewById(R.id.tvResult);

        // set a listener
        btnAdd.setOnClickListener((View.OnClickListener) this); btnSub.setOnClickListener((View.OnClickListener) this);   btnMult.setOnClickListener((View.OnClickListener) this);
        btnDiv.setOnClickListener((View.OnClickListener) this); btnPoint.setOnClickListener((View.OnClickListener) this); btnEnt.setOnClickListener((View.OnClickListener) this);
        btnC.setOnClickListener((View.OnClickListener) this);   btnElv2.setOnClickListener((View.OnClickListener) this);

        btn0.setOnClickListener((View.OnClickListener) this); btn1.setOnClickListener((View.OnClickListener) this); btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this); btn4.setOnClickListener((View.OnClickListener) this); btn5.setOnClickListener((View.OnClickListener) this);
        btn6.setOnClickListener((View.OnClickListener) this); btn7.setOnClickListener((View.OnClickListener) this); btn8.setOnClickListener((View.OnClickListener) this);
        btn9.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        // TODO Auto-generated method stub
        float result = 0;

        switch (view.getId()) {
            case R.id.btn0:
                etNum1.setText(etNum1.getText()+"0");
                break;
            case R.id.btn1:
                etNum1.setText(etNum1.getText()+"1");
                break;
            case R.id.btn2:
                etNum1.setText(etNum1.getText()+"2");
                break;
            case R.id.btn3:
                etNum1.setText(etNum1.getText()+"3");
                break;
            case R.id.btn4:
                etNum1.setText(etNum1.getText()+"4");
                break;
            case R.id.btn5:
                etNum1.setText(etNum1.getText()+"5");
                break;
            case R.id.btn6:
                etNum1.setText(etNum1.getText()+"6");
                break;
            case R.id.btn7:
                etNum1.setText(etNum1.getText()+"7");
                break;
            case R.id.btn8:
                etNum1.setText(etNum1.getText()+"8");
                break;
            case R.id.btn9:
                etNum1.setText(etNum1.getText()+"9");
                break;
            case R.id.btnPoint:
                etNum1.setText(etNum1.getText()+".");
                break;
            case R.id.btnC:
                etNum1.setText("");
                etNum2.setText("");
                break;
            default:
                break;
        }
        // check if the fields are empty
        if (TextUtils.isEmpty(etNum1.getText().toString())){
//                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        // read EditText and fill variables with numbers
        num1 = Float.parseFloat(etNum1.getText().toString());
//        num2 = Float.parseFloat(etNum2.getText().toString());

        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output
        switch (view.getId()) {
            case R.id.btnAdd:
                oper = "+";
                num1 = num2 + num1;
                num2 = 0;
                etNum1.setText(""+num1);
                etNum2.setText("0");
                break;
            case R.id.btnSub:
                oper = "-";
                num1 = num2 - num1;
                num2 = 0;
                etNum1.setText(""+num1);
                etNum2.setText("0");
                break;
            case R.id.btnMult:
                oper = "*";
                num1 = num2 * num1;
                num2 = 0;
                etNum1.setText(""+num1);
                etNum2.setText("0");
                break;
            case R.id.btnDiv:
                oper = "/";
                num1 = num2 / num1;
                num2 = 0;
                etNum1.setText(""+num1);
                etNum2.setText("0");
                break;
            case R.id.btnElv2:
                oper = "/";
                num1 = num1*num1;
                etNum1.setText(""+num1);
                etNum2.setText("0");
                break;
            case R.id.btnEnt:
                num2 = num1;
                etNum2.setText(""+etNum1.getText());
                num1 = 0;
                etNum1.setText("");
                break;
            default:
                break;
        }

        // form the output line
//        etNum1.setText(""+num1);
//        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
