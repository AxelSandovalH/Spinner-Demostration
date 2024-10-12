package com.example.actspinner1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner animales, animales2;
    String[] opciones = {"Oso", "Tigre", "Delfin", "Águila"};
    int spinner1 = 0, spinner2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        animales = (Spinner) findViewById(R.id.animales);
        animales2 = (Spinner) findViewById(R.id.animales2);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, opciones);
        animales.setAdapter(aa);
        animales2.setAdapter(aa);
        animales.setOnItemSelectedListener(this);
        animales2.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.animales) {
            spinner1 = position;
            Toast.makeText(MainActivity.this, spinner1 +
                            " " + opciones[spinner1] +
                            " de animales ",
                    Toast.LENGTH_LONG).show();
        }
        if (parent.getId() == R.id.animales2) {
            spinner2 = position;
            Toast.makeText(MainActivity.this, spinner2 +
                            " " + opciones[spinner2] +
                            " de animales2 ",
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}