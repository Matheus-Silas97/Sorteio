package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class raffle1000 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raffle1000);
    }

    public void raffle1000(View view) {
        TextView txt_raffle1000 = (TextView) findViewById(R.id.txt_raffle1000);
        int num1000 = new Random().nextInt(1001);
        txt_raffle1000.setText("O número sorteado foi: " + num1000);
    }
}
