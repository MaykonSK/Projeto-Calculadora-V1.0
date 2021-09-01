package com.example.prjcalc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Double vl1 = 0.0;
    Double vl2 = 0.0;
    Double vResultado = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNum1 = findViewById(R.id.editNum1);
        EditText editNum2 = findViewById(R.id.editNum2);
        Button btnSoma = findViewById(R.id.btnSoma);
        Button btnSub = findViewById(R.id.btnSub);
        Button btnDividir = findViewById(R.id.btnDividir);
        Button btnMulti = findViewById(R.id.btnMulti);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vl1 = Double.parseDouble(editNum1.getText().toString());
                vl2 = Double.parseDouble(editNum2.getText().toString());

                vResultado = vl1 + vl2;

                txtResultado.setText(vResultado.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vl1 = Double.parseDouble(editNum1.getText().toString());
                vl2 = Double.parseDouble(editNum2.getText().toString());

                vResultado = vl1 - vl2;

                txtResultado.setText(vResultado.toString());
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vl1 = Double.parseDouble(editNum1.getText().toString());
                vl2 = Double.parseDouble(editNum2.getText().toString());

                vResultado = vl1 / vl2;

                txtResultado.setText(vResultado.toString());
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vl1 = Double.parseDouble(editNum1.getText().toString());
                vl2 = Double.parseDouble(editNum2.getText().toString());

                vResultado = vl1 * vl2;

                txtResultado.setText(vResultado.toString());
            }
        });

    }
}