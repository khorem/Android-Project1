package com.example.projet1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.widget.ArrayAdapter;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Button;

public class MatiereActivity extends AppCompatActivity {
    ListView matieres;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matiere);
        matieres=(ListView) findViewById(R.id.ltview);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("Management de Securite");
        arrayList.add("Big Data");
        arrayList.add("Anglais");
        arrayList.add("TE");
        arrayList.add("Angular");
        arrayList.add("Dot net");
        arrayList.add("IA");
        arrayList.add("Dev Opps");
        arrayList.add("Gestion des Affaires");
        arrayList.add("Cyber Defense");
        arrayList.add("Gestion de Projets");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        matieres.setAdapter(arrayAdapter);
    }
}