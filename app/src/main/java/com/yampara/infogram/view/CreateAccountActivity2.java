package com.vfz.nebula.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.vfz.nebula.R;

public class CreateAccountActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);

        showToolbar(getString(R.string.tilte_crearCuenta),true);
    }

    //vincular la codigo java con toolbar-->
    public void showToolbar(String titulo, boolean botonSubir){
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            getSupportActionBar().setTitle(titulo);
            getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);

    }

}