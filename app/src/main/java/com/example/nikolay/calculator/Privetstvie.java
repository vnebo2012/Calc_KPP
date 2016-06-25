package com.example.nikolay.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Privetstvie extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privetstvie);
    }

    public void onClick_privet(View view) {
        Intent intent = new Intent(Privetstvie.this, StartActivity.class);
        startActivity(intent);
    }
}
