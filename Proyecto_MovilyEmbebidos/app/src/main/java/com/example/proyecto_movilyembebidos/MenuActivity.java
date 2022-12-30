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
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.proyecto_movilyembebidos.R.id;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MenuActivity extends AppCompatActivity {
    Button btnConta1, btnConta2, btnConta3, btnCont1, btnCont2, btnCont3, btnR;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnConta1=(Button) findViewById(R.id.btnConta1);
        btnCont1=(Button) findViewById(R.id.btnCont1);
        btnConta2=(Button) findViewById(R.id.btnConta2);
        btnCont2=(Button) findViewById(R.id.btnCont2);
        btnConta3=(Button) findViewById(R.id.btnConta3);
        btnCont3=(Button) findViewById(R.id.btnCont3);
        btnR=(Button) findViewById(R.id.btnR);

        btnConta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Encender("http://192.168.100.39/relay?r3=on");
            }
        });
        btnCont1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Apagar("http://192.168.100.39/relay?r3=off");
            }
        });
        btnConta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Encender("http://192.168.100.39/relay?r2=on");
            }
        });
        btnCont2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Apagar("http://192.168.100.39/relay?r2=off");
            }
        });
        btnConta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Encender("http://192.168.100.39/relay?r4=on");
            }
        });
        btnCont3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Apagar("http://192.168.100.39/relay?r4=off");
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void Encender(String url) {
        JsonArrayRequest stringArray = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i <= response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        jsonObject.getString("relay");
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Contacto Encendido", Toast.LENGTH_LONG).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringArray);
    }
    private void Apagar(String url) {
        JsonArrayRequest stringArray = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i <= response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        jsonObject.getString("relay");
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Contacto Apagado", Toast.LENGTH_LONG).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringArray);
    }
}