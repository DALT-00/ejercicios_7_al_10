package com.example.ejercicios7al10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class notificacion extends AppCompatActivity {
    private EditText tv3;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacion);
        tv3=(EditText) findViewById(R.id.tv3);
        num = (int) (Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast notificar = Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificar.show();
    }

    //Metodo del boton
    public void calcular(View view){
        String valor_ingresado= tv3.getText().toString();
        int numero = Integer.parseInt(valor_ingresado);
        if (numero==num){
            Toast notificar = Toast.makeText(this,"Muy bien recordastes el numero",Toast.LENGTH_LONG);
            notificar.show();
        }else {
            Toast notificar = Toast.makeText(this,"Lo siento pero no es el numero ",Toast.LENGTH_LONG);
            notificar.show();
        }
    }

    public void res (View view){
        Intent siguiente = new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }
}