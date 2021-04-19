package com.br.culturanerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Código responsável por contar o tempo para mudar da splash para Autenticacao
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirAutenticacao();  }
        }, 3000); // Tempo de abertura da tela
    }

    // Método responsável por chamar a tela de Autenticacao
    private void abrirAutenticacao() {
        Intent i = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(i);
        finish();
    }
}