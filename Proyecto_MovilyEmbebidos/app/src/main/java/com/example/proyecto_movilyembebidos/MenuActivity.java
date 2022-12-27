package com.example.proyecto_movilyembebidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnConta1, btnConta2, btnConta3, btnCont1, btnCont2, btnCont3;
    private String ONContacto1, ONContacto2, ONContacto3, OFFContacto1, OFFContacto2, OFFContacto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ONContacto1="http://192.168.196.70/relay?r1=on";
        OFFContacto1="http://192.168.196.70/relay?r1=Off";
        ONContacto2="http://192.168.196.70/relay?r2=on";
        OFFContacto2="http://192.168.196.70/relay?r2=Off";
        ONContacto3="http://192.168.196.70/relay?r3=on";
        OFFContacto3="http://192.168.196.70/relay?r3=off";

        btnConta1=(Button) findViewById(R.id.btnConta1);
        btnCont1=(Button) findViewById(R.id.btnCont1);
        btnConta2=(Button) findViewById(R.id.btnConta2);
        btnCont2=(Button) findViewById(R.id.btnCont2);
        btnConta3=(Button) findViewById(R.id.btnConta3);
        btnCont3=(Button) findViewById(R.id.btnCont3);

        btnConta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(ONContacto1);
                Intent intent = new Intent(Intent.ACTION_SEND, uri);
                startActivity(intent);
            }
        });
        btnCont1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(OFFContacto1);
                Intent intent = new Intent(Intent.ACTION_SEND, uri);
                startActivity(intent);
            }
        });
        btnConta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(ONContacto2);
                Intent intent = new Intent(Intent.ACTION_SEND, uri);
                startActivity(intent);
            }
        });
        btnCont2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(OFFContacto2);
                Intent intent = new Intent(Intent.ACTION_SEND, uri);
                startActivity(intent);
            }
        });
        btnConta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(ONContacto3);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(intent);
            }
        });
        btnCont3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(OFFContacto3);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(intent);
            }
        });
    }
}