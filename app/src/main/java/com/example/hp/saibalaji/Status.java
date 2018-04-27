package com.example.hp.saibalaji;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Status extends AppCompatActivity {
    Button button8;
    EditText editText16,et12,et13,et14,et5;
    Button button17;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        button8=(Button) findViewById(R.id.button7);
        myDb = new DatabaseHelper(this);
        et12 = (EditText) findViewById(R.id.et12);
        button17 = (Button) findViewById(R.id.button17);
        et5 = (EditText) findViewById(R.id.et5);
        et12 = (EditText) findViewById(R.id.et12);
        et14= (EditText) findViewById(R.id.et14);
        editText16 = (EditText) findViewById(R.id.editText16);
       // editText17 = (EditText) findViewById(R.id.editText17);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = myDb.getData(et12.getText().toString());
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        et5.setText(cursor.getString(2));
                        et13.setText(cursor.getString(3));
                        et14.setText(cursor.getString(5));
                        editText16.setText(cursor.getString(6));
                       // editText17.setText(cursor.getString(5));
                    }
                    Toast.makeText(Status.this, "Data Retrieved Successfully", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Status.this, "No Data to Retrieve", Toast.LENGTH_LONG).show();
                }

            }
        });

    }


    public void btn7(View v){
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }
}
