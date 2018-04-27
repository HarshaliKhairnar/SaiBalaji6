package com.example.hp.saibalaji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Task extends AppCompatActivity {
    Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        button12 = (Button) findViewById(R.id.button12);
    }
    public void manu(View v) {
        Intent i = new Intent(this, Add.class);
        startActivity(i);
    }
}
