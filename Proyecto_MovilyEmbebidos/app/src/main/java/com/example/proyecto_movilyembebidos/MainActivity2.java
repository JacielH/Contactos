package com.example.proyecto_movilyembebidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btnLuz, btnPuerta, btnMulticontactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnLuz=(Button) findViewById(R.id.btnLuz);
        btnPuerta=(Button) findViewById(R.id.btnPuerta);
        btnMulticontactos=(Button) findViewById(R.id.btnMulticontactos);

        btnLuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MenuActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        btnMulticontactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}