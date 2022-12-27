package com.example.proyecto_movilyembebidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MenuActivity extends AppCompatActivity {
    Button btnConta1, btnConta2, btnConta3, btnCont1, btnCont2, btnCont3;
    private String ONContacto1, ONContacto2, ONContacto3, OFFContacto1, OFFContacto2, OFFContacto3;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //ONContacto1="http://192.168.100.53/relay?r1=on";
        //OFFContacto1="http://192.168.100.53/relay?r1=off";
        //ONContacto2="http://192.168.100.53/relay?r2=on";
        //OFFContacto2="http://192.168.100.53/relay?r2=off";
        //ONContacto3="http://192.168.100.53/relay?r3=on";
        //OFFContacto3="http://192.168.100.53/relay?r3=off";

        btnConta1=(Button) findViewById(R.id.btnConta1);
        btnCont1=(Button) findViewById(R.id.btnCont1);
        btnConta2=(Button) findViewById(R.id.btnConta2);
        btnCont2=(Button) findViewById(R.id.btnCont2);
        btnConta3=(Button) findViewById(R.id.btnConta3);
        btnCont3=(Button) findViewById(R.id.btnCont3);

        btnConta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizar("http://192.168.100.53/");
            }
        });
        btnCont1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizar("http://192.168.100.53/relay?r1=off");
            }
        });
        btnConta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizar("http://192.168.100.53/relay?r2=on");
            }
        });
        btnCont2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizar("http://192.168.100.53/relay?r2=off");
            }
        });
        btnConta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizar("http://192.168.100.53/relay?r3=on");
            }
        });
        btnCont3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualizar("http://192.168.100.53/relay?r3=off");
            }
        });
    }
    private void actualizar(String url){
        StringRequest stringRequest= new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Operacion realizada", Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_LONG).show();
            }
        }){
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}