package com.example.vc.newapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RadioButtonCal(View v){
        //Edit text Controls and Typecasting
        EditText e1 = (EditText) findViewById(R.id.editText);
        int First = Integer.parseInt(e1.getText().toString());
        EditText e2 = (EditText) findViewById(R.id.editText2);
        int Second = Integer.parseInt(e2.getText().toString());
        EditText e3 = (EditText) findViewById(R.id.editText3);
        //RadioButton Control
        RadioButton R1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton R2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton R3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton R4 = (RadioButton) findViewById(R.id.radioButton4);
        boolean val1 = R1.isChecked();
        boolean val2 = R2.isChecked();
        boolean val3 = R3.isChecked();
        boolean val4 = R4.isChecked();
        if(val1 == true){
            int Add = First + Second;
            e3.setText(Integer.toString(Add));
        }
        else if(val2 == true){
            int Sub = First - Second;
            e3.setText(Integer.toString(Sub));
        }
        else if(val3 == true){
            int Mul = First * Second;
            e3.setText(Integer.toString(Mul));
        }
        else if(val4 == true){
            int Div = First / Second;
            e3.setText(Integer.toString(Div));
        }
    }
}
