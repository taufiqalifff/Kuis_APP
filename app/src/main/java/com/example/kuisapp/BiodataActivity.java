package com.example.kuisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata);
    }

    public void toBack(View view) {
        Intent a = new Intent(BiodataActivity.this, MainActivity.class);
        startActivity(a);
    }

    public void toQuit(View view) {
        MainActivity.quit(this);
    }
}