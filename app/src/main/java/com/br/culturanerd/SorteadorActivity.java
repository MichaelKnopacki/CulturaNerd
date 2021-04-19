package com.br.culturanerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SorteadorActivity extends AppCompatActivity {

    //Declarando o itens dentro do "java", para interagir com o itens do layout.
    private Button bdez, bcem, bmil, bdezm;
    private TextView rdez, rcem, rmil, rdezm;

    protected void onCreate(Bundle savedInstanceState) { // Começa o processo de geração de números
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteador);

        bdez = (Button) findViewById(R.id.btnDez); // O botão "bdez" declarado acima, interage com o "btnDez" no layout
        bcem = (Button) findViewById(R.id.btnCem); // O botão "bcem" declarado acima, interage com o "btnCem" no layout
        bmil = (Button) findViewById(R.id.btnMil); // O botão "bmil" declarado acima, interage com o "btnMil" no layout
        bdezm = (Button) findViewById(R.id.btnDezM); // O botão "bdezm" declarado acima, interage com o "btnDezM" no layout
        rdez = (TextView) findViewById(R.id.respDez); // O botão "rdez" declarado acima, interage com o "respDez" no layout
        rcem = (TextView) findViewById(R.id.respCem); // O botão "rcem" declarado acima, interage com o "respCem" no layout
        rmil = (TextView) findViewById(R.id.respMil); // O botão "rmil" declarado acima, interage com o "respMil" no layout
        rdezm = (TextView) findViewById(R.id.respDezM); // O botão "rdezm" declarado acima, interage com o "respDezM" no layout

        //bdez está "setado" para receber um clique
        bdez.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { // O clique recebido ( bdez.setOnClickListener(new View.OnClickListener() ), dá inicio ao "random"
                Random rn = new Random(); // ( rn = Random numbers ) declarando que foi feito para gerar numeros "randomicos"
                int answer = rn.nextInt(10) + 1; // Declarado uma variavel int=inteiro, para receber o numero nesse caso de 1 a 10
                rdez.setText(String.valueOf(answer)); // a variavel rdez vai alterar e imprimir (set) o valor "answer" (numero de 1 a 10)
            }
        });

        bcem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(100) + 1;
                rcem.setText(String.valueOf(answer));
            }
        });

        bmil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(1000) + 1;
                rmil.setText(String.valueOf(answer));
            }
        });

        bdezm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int answer = rn.nextInt(10000) + 1;
                rdezm.setText(String.valueOf(answer));
            }
        });
    } // Fecha o processo de geração de números
}
