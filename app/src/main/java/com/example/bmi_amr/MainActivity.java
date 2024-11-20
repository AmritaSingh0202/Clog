package com.example.bmi_amr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtweight, edtheightft, edtheightinch;
        Button btnCalculate;
        TextView txtResult;
        edtweight=findViewById(R.id.edtweight);
        edtheightft=findViewById(R.id.edtheightft);
        edtheightinch=findViewById(R.id.edtheightinch);
        btnCalculate=findViewById(R.id.btnCalculate);
        txtResult= findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int weight=Integer.parseInt(edtweight.getText().toString());
                int feet=Integer.parseInt(edtheightft.getText().toString());
                int inch=Integer.parseInt(edtheightinch.getText().toString());
                int totalin=feet*12+inch;
                double totalcm=totalin*2.53;
                double totalm=totalin/100.0;
                double Bmi=weight/(totalm*totalm);
                if(Bmi>25)
                {
                    txtResult.setText("You are OverWeight");
                }
                else if (Bmi<18)
                {
                    txtResult.setText("You are Underweight");
                }
                else{
                    txtResult.setText("You are healthy");
                }




            }
        });


    }
}