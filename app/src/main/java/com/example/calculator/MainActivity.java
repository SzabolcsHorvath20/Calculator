package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView eredmeny;
    private Button gomb1,gomb2,gomb3,gomb4,gomb5,gomb6,gomb7,gomb8,gomb9,gomb0,gombDivide,gombMultiply,gombSubstract,gombAdd,gombEqual,gombCE;
    private double szam1,szam2;
    boolean Add, Subtract, Multiply, Divide;
    private String seged;

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
        eredmeny = findViewById(R.id.Kiiras);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.gombCE:
                eredmeny.setText("");
                break;
            case R.id.gombEqual:
                szam2 = Float.parseFloat(eredmeny.getText() + "");

                if (Add == true) {
                    eredmeny.setText(szam1 + szam2 + "");
                    Add = false;
                }

                if (Subtract == true) {
                    eredmeny.setText(szam1 - szam2 + "");
                    Subtract = false;
                }

                if (Multiply == true) {
                    eredmeny.setText(szam1 * szam2 + "");
                    Multiply = false;
                }

                if (Divide == true) {
                    eredmeny.setText(szam1 / szam2 + "");
                    Divide = false;
                }
                break;
            case R.id.gombAdd:
                if (eredmeny == null) {
                    eredmeny.setText("");
                } else {
                    szam1 = Double.parseDouble(eredmeny.getText() + "");
                    Add = true;
                    eredmeny.setText(null);
                }
                break;
            case R.id.gombSubstract:
                szam1 = Double.parseDouble(eredmeny.getText() + "");
                Subtract = true;
                eredmeny.setText(null);
                break;
            case R.id.gombMultiply:
                szam1 = Double.parseDouble(eredmeny.getText() + "");
                Multiply = true;
                eredmeny.setText(null);
                break;
            case R.id.gombDivide:
                szam1 = Double.parseDouble(eredmeny.getText() + "");
                Divide = true;
                eredmeny.setText(null);
                break;
            case R.id.gomb1:
            case R.id.gomb2:
            case R.id.gomb3:
            case R.id.gomb4:
            case R.id.gomb5:
            case R.id.gomb6:
            case R.id.gomb7:
            case R.id.gomb8:
            case R.id.gomb9:
            case R.id.gomb0:
                seged += ((Button)v).getText();
                eredmeny.setText(seged);
                seged = "";
                break;
        }
    }
}
