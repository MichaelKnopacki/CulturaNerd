package com.br.culturanerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    //clicando no "Sorteador" a tela "Start" que é a tela "Menu", direciona o usuário para tela "SorteadorActivity.
    public void Sorteador(View view){startActivity(new Intent(this, SorteadorActivity.class)); }
    //clicando no "Dados" a tela "Start" que é a tela "Menu", direciona o usuário para tela "DadosActivity.
    public void Dados(View view){
        startActivity(new Intent(this, DadosActivity.class));
    }
    //clicando no "Frases" a tela "Start" que é a tela "Menu", direciona o usuário para tela "FrasesActivity.
    public void Frases(View view){
        startActivity(new Intent(this, FrasesActivity.class));
    }
}