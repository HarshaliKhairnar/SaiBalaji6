package com.example.hp.saibalaji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KnowMore extends AppCompatActivity {
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_more);
        button9 = (Button) findViewById(R.id.button2);
    }
    public void btn5(View v) {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }

}
