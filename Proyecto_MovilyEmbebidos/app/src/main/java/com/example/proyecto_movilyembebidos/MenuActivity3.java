package com.example.proyecto_movilyembebidos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.TaskStackBuilder;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity3 extends AppCompatActivity {

    Button btnAbrir, btnCerrar, btnSal;
    private static final String CHANNEL_ID = "Canal", CHANNEL_I = "Canal2";
    private PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

        btnAbrir = (Button) findViewById(R.id.btnAbrir);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);
        btnSal = (Button) findViewById(R.id.btnSal);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                    showNotification();
                } else {
                    showNewNotification();
                }
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.O){
                    showNotify();
                } else {
                    showNewNotify();
                }
            }
        });

        btnSal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity3.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
    