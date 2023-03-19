package com.example.ExaIIP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ActivityListView extends AppCompatActivity {

    private ListView ContactosListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        //Obtener la lista de Contactos
        //ArrayList<Contactos> contactos = 0btenerContactos();

        //Configurar el Adaptador
        CustomBaseAdapter adapter = new CustomBaseAdapter();

        //Mostrar la lista de Contactos
        ContactosListView = findViewById(R.id.customListView);
        ContactosListView.setAdapter(adapter);
    }
}