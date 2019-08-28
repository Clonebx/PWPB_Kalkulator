package com.example.pwpb_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    EditText vTxtA, vTxtB, vTxtC;
    protected float yTxtA, yTxtB, yTxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    @Override
    public void onClick(View view) {
        yTxtA = Float.parseFloat(vTxtA.getText().toString());
        yTxtB = Float.parseFloat(vTxtB.getText().toString());

        switch (view.getId()){
            case R.id.btnTambah:
                yTxtC = yTxtA + yTxtB;
                break;
            case R.id.btnKurang:
                yTxtC = yTxtA - yTxtB;
                break;
            case R.id.btnKali:
                yTxtC = yTxtA * yTxtB;
                break;
            case R.id.btnBagi:
                yTxtC = yTxtA / yTxtB;
                break;
        }

        vTxtC.setText(Float.toString(yTxtC));
    }

    private void initComponent() {
        vTxtA = findViewById(R.id.txtA);
        vTxtB = findViewById(R.id.txtB);
        vTxtC = findViewById(R.id.txtC);

        Button vBtnTambah =  findViewById(R.id.btnTambah);
        Button vBtnKurang = findViewById(R.id.btnKurang);
        Button vBtnKali = findViewById(R.id.btnKali);
        Button vBtnBagi = findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
    }
}
