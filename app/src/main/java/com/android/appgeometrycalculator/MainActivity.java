package com.android.appgeometrycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_main);
    }
    public void btnHitung(View view){
        Spinner bangun = (Spinner) findViewById(R.id.spinner);
        EditText inp1 = (EditText) findViewById(R.id.input1);
        EditText inp2 = (EditText) findViewById(R.id.input2);
        TextView luas = (TextView) findViewById(R.id.hasilluas);
        TextView kel = (TextView) findViewById(R.id.hasilkeliling);

        String angka1 = inp1.getText().toString();
        String angka2 = inp2.getText().toString();
        int i1 = Integer.parseInt(angka1);
        int i2 = Integer.parseInt(angka2);

        if (bangun.getSelectedItem().toString().equals("Persegi")){
            int hasilluas = i1*i2;
            String hasil1 = String.valueOf(hasilluas);
            luas.setText(hasil1);

            int hasilkeliling = (2*i1)+(2*i2);
            String hasil2 = String.valueOf(hasilkeliling);
            kel.setText(hasil2);
        }

        else if (bangun.getSelectedItem().toString().equals("Lingkaran")){
            double pi = Math.PI;

            double hasilluas = pi*(2*i1);
            String hasil1 = String.valueOf(hasilluas);
            luas.setText(hasil1);

            double hasilkeliling = pi*(2*i1);
            String hasil2 = String.valueOf(hasilkeliling);
            kel.setText(hasil2);
        }

        else if (bangun.getSelectedItem().toString().equals("Segitiga")){
            double hasilluas = (i1*i2)/2;
            String hasil1 = String.valueOf(hasilluas);
            luas.setText(hasil1);

            double sqrt = (float) Math.sqrt((i1*i1)+(i2*i2));
            double hasilkeliling = i1+i2+sqrt;
            String hasil2 = String.valueOf(hasilkeliling);
            kel.setText(hasil2);
        }

    }
}

