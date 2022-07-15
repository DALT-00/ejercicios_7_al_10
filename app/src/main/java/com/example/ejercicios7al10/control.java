package com.example.ejercicios7al10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class control extends AppCompatActivity {
    private EditText tv4, pas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        tv4=(EditText) findViewById(R.id.tv4);
        pas=(EditText) findViewById(R.id.pas);

    }

    //Metodo del boton verificar
    public void verificar(View view){
        String valor = pas.getText().toString();
        if(valor.length()==0){
            Toast notificacion = Toast.makeText(this, "La clave no se puede quedar vacia",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }

    // Metodo de regresar
    public void regresar (View view){
        Intent volver = new Intent(this,MainActivity.class);
        startActivity(volver);
    }
}