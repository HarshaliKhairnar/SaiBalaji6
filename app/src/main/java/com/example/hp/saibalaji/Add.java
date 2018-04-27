package com.example.hp.saibalaji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add extends AppCompatActivity {
    Button button14;
    Dbhelp myDb;
    //EditText txtData;
    EditText data;
    Button button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        button14 = (Button) findViewById(R.id.button14);
        myDb = new Dbhelp(this);
        data=(EditText) findViewById(R.id.dataa);
        button15=(Button) findViewById(R.id.button15);
       button15.setOnClickListener(new View.OnClickListener(){

            @Override
                 public void onClick(View v){
                  ClickMe();
            }
        });

    }
    private void ClickMe(){

        String name = data.getText().toString();
        Boolean result = myDb.insertData(name);
        if (result == true){ Toast.makeText(Add.this, "Data Inserted Succesfully", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(Add.this, "Data Inserted Failed", Toast.LENGTH_SHORT).show();
        }}
    public void man(View v) {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
    }
}
