package com.br.culturanerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DadosActivity extends AppCompatActivity {

    private Button bseis, bdoze, bvinte, bcen;
    private TextView rseis, rdoze, rvinte, rcen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        bseis = (Button) findViewById(R.id.btnSeis);
        bdoze = (Button) findViewById(R.id.btnDoze);
        bvinte = (Button) findViewById(R.id.btnVinte);
        bcen = (Button) findViewById(R.id.btnCen);
        rseis = (TextView) findViewById(R.id.respSeis);
        rdoze = (TextView) findViewById(R.id.respDoze);
        rvinte = (TextView) findViewById(R.id.respVinte);
        rcen = (TextView) findViewById(R.id.respCen);


        bseis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(6) + 1;
                rseis.setText(String.valueOf(answer));
            }
        });

        bdoze.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(12) + 1;
                rdoze.setText(String.valueOf(answer));
            }
        });

        bvinte.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(20) + 1;
                rvinte.setText(String.valueOf(answer));
            }
        });

        bcen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(100) + 1;
                rcen.setText(String.valueOf(answer));
            }
        });
    }
}