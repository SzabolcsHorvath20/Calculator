package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView eredmeny;
    private Button gomb1,gomb2,gomb3,gomb4,gomb5,gomb6,gomb7,gomb8,gomb9,gomb0,gombDivide,gombMultiply,gombSubstract,gombAdd,gombEqual,gombCE;
    private String Kiiras = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init()
    {
        gomb1 = findViewById(R.id.gomb1);
        gomb2 = findViewById(R.id.gomb2);
        gomb3 = findViewById(R.id.gomb3);
        gomb4 = findViewById(R.id.gomb4);
        gomb5 = findViewById(R.id.gomb5);
        gomb6 = findViewById(R.id.gomb6);
        gomb7 = findViewById(R.id.gomb7);
        gomb8 = findViewById(R.id.gomb8);
        gomb9 = findViewById(R.id.gomb9);
        gomb0 = findViewById(R.id.gomb0);
        gombCE = findViewById(R.id.gombCE);
        gombDivide = findViewById(R.id.gombDivide);
        gombMultiply = findViewById(R.id.gombMultiply);
        gombSubstract = findViewById(R.id.gombSubstract);
        gombAdd = findViewById(R.id.gombAdd);
        gombEqual = findViewById(R.id.gombEqual);
        eredmeny = findViewById(R.id.Eredmeny);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

        }
    }
}
