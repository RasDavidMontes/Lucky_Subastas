package com.example.luckysubastas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perfil_user(View view) {
        //Iniciar la nueva actividad
        Intent perfil = new Intent(this, UserSessionActivity.class);
        startActivity( perfil);
    }

    public void playGame(View view) {
        //Iniciar la nueva actividad
        Intent jugar = new Intent(this, MainActivity.class);
        startActivity(jugar);
    }

}