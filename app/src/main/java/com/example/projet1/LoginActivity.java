package com.example.projet1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button btcompte;
    Button btconnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Chercher le bouton
        btcompte = (Button) findViewById(R.id.btcompte);
        btconnexion = (Button) findViewById(R.id.btconnexion);
        //Action obtenue après avoir cliqué sur bouton
        btcompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent StartInActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(StartInActivity);
            }
        });

        btconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent StartInActivity = new Intent(getApplicationContext(), MatiereActivity.class);
                startActivity(StartInActivity);
            }
        });
    }
}