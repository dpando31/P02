package com.example.gerard.p02;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class PersonalDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        findViewById(R.id.buttonSiguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               enviarDatos();
            }
        });
    }

    void enviarDatos(){
       String nombre = ((EditText) findViewById(R.id.editTextNombre)).getText().toString();
        String apell = ((EditText) findViewById(R.id.editTextNombre)).getText().toString();

    }
}
