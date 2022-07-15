package com.example.ejercicios7al10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Metodo para el boto listview
    public void List(View view){
        Intent siguiente = new Intent(this,listview.class);
        startActivity(siguiente);
    }
    //Metodo para el boto imagenbutton
    public void imagenbutton (View view){
        Intent siguiente = new Intent(this,imagen.class);
        startActivity(siguiente);
    }
    //Metodo para el boto metodo toast
    public void toast (View view){
        Intent siguiente = new Intent(this,notificacion.class);
        startActivity(siguiente);
    }
    //Metodo para el boto control
    public void control (View view){
        Intent siguiente = new Intent(this,control.class);
        startActivity(siguiente);
    }
}