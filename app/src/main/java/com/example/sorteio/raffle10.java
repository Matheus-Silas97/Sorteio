package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class raffle10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raffle10);
    }

    public void raffle10(View view) {
        TextView txt_raffle10 = (TextView) findViewById(R.id.txt_raffle10);
        int num10 = new Random().nextInt(11);
        txt_raffle10.setText("O número sorteado foi: " + num10);
    }
}
