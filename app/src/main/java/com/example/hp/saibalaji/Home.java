package com.example.hp.saibalaji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button button2;
    Button button3;
    Button button6;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button6 = (Button) findViewById(R.id.button6);
        button = (Button) findViewById(R.id.button);
    }

    public void btn1(View v) {
        Intent i = new Intent(this, NewEntry.class);
        startActivity(i);
    }

    public void btn2(View v) {
        Intent i = new Intent(this, Status.class);
        startActivity(i);

    }

    public void btn6(View v) {
        Intent i = new Intent(this, KnowMore.class);
        startActivity(i);


}
    public void hk(View v) {
        Intent i = new Intent(this, Task.class);
        startActivity(i);
    }}
