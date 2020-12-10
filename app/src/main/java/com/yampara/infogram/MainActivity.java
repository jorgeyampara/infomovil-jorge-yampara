package com.vfz.nebula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.vfz.nebula.view.ContainerActivity;
import com.vfz.nebula.view.CreateAccountActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //usando intent para enviar a otro activity anterior
    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity2.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}