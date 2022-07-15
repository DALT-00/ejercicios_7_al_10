package com.example.ejercicios7al10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class imagen extends AppCompatActivity {
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);
        tv2=(TextView) findViewById(R.id.tv2);
    }
    //Metodo para el boton llamar
    public void llamar (View view){
        tv2.setText("Llamando");
    }
    public void re (View view){
        Intent siguiente = new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }
}