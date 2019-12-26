package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void raffle10(View view) {
        Intent intent = new Intent(this, raffle10.class);
        startActivity(intent);
    }

    public void raffle100(View view) {
        Intent intent = new Intent(this, raffle100.class);
        startActivity(intent);
    }

    public void raffle1000(View view) {
        Intent intent = new Intent(this, raffle1000.class);
        startActivity(intent);
    }
}
