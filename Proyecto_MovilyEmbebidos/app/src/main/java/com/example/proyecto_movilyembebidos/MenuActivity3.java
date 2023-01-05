package com.example.proyecto_movilyembebidos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity3 extends AppCompatActivity {

    Button btnAbrir, btnCerrar, btnSal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

        btnAbrir=(Button) findViewById(R.id.btnAbrir);
        btnCerrar=(Button) findViewById(R.id.btnCerrar);
        btnSal=(Button) findViewById(R.id.btnSal);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity3.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}