package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class raffle100 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raffle100);
    }

    public void raffle100(View view) {
        TextView txt_raffle100 = (TextView) findViewById(R.id.txt_raffle100);
        int num100 = new Random().nextInt(101);
        txt_raffle100.setText("O número sorteado foi: " + num100);
    }
}
