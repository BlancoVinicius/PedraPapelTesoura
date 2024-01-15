package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Clock;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoSelecionada(String opcao) {
        ImageView im = findViewById(R.id.imageView);

        int numero = new Random().nextInt(3);
        String[] opcaoApp = {"Pedra","Papel", "Tesoura"};
        String op = opcaoApp[numero];

        switch (op) {
            case "Pedra":
                im.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                im.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                im.setImageResource(R.drawable.tesoura);
                break;
        }

        TextView tx = findViewById(R.id.txtResult);

        if (opcao == "Pedra" & op == "Pedra"){
            tx.setText("Empate");
        } else if (opcao == "Pedra" & op == "Tesoura") {
            tx.setText("Voçe ganhou!");
        } else if (opcao == "Pedra" & op == "Papel") {
            tx.setText("Voçe perdeu!");
        } else if (opcao == "Papel" & op == "Pedra") {
            tx.setText("Voçe ganhou");
        }else if (opcao == "Papel" & op == "Tesoura"){
            tx.setText("Voçe perdeu");
        } else if (opcao == "Papel" & op == "Papel") {
            tx.setText("Empate");
        } else if (opcao == "Tesoura" & op == "Pedra") {
            tx.setText("Voçe perdeu");
        } else if (opcao == "Tesoura" & op == "Papel") {
            tx.setText("Voçe ganhou");
        } else if (opcao == "Tesoura" & op == "Tesoura") {
            tx.setText("Empate");
        }

    }
    public void selectPapel(View view){
        this.opcaoSelecionada("Papel");
    }
    public void selectPedra(View view){
        this.opcaoSelecionada("Pedra");
    }
    public void selectTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }

}