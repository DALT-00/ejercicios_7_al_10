package com.example.ejercicios7al10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class listview extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;
    private String paises [] = {"Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela",
            "Uruguay"};
    private String poblacion [] = {"40000000", "17000000", "6500000", "10000000", "30000000", "14000000", "183000000", "44000000",
            "29000000", "3500000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        tv1=(TextView) findViewById(R.id.tv1);
        lv1=(ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("La poblacion de: "+lv1.getItemAtPosition(position)+" es "+poblacion[position]);
            }
        });
    }

    //Metodo para el boto control
    public void regresar  (View view){
        Intent siguiente = new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }
}