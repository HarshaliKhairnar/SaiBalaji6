package com.example.hp.saibalaji;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class NewEntry extends AppCompatActivity {
    DatabaseHelper myDb;
    Button button7;
    Button cam1;
    private static final int CAMERA_REQUEST=123;
    EditText name,contact,emi,problem,solution;
    ImageView imageView;
   // private DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);
        //myDb = new DatabaseHelper(this);
        button7=(Button) findViewById(R.id.button7);
        cam1=(Button)findViewById(R.id.cam1);
        imageView =(ImageView) imageView.findViewById(R.id.imageView);
       myDb = new DatabaseHelper(this);
        name = (EditText) findViewById(R.id.editText2);
        contact = (EditText) findViewById(R.id.editText3);
        emi = (EditText) findViewById(R.id.editText4);
        problem = (EditText) findViewById(R.id.editText6);
        solution = (EditText) findViewById(R.id.editText7);
        button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                btn7();
            }
        });

    }
    public void btn7(){
        String nam=name.getText().toString();
        String con=contact.getText().toString();
        String em=emi.getText().toString();
        String pro=problem.getText().toString();
        String sol=solution.getText().toString();
        boolean result = myDb.insertdata(nam, con, em,  pro,sol);
        if(result == true){ Toast.makeText(this, "DATA INSERTED", Toast.LENGTH_SHORT).show();}
        else {
            Toast.makeText(this, "DATA not INSERTED", Toast.LENGTH_SHORT).show();
        }
        Intent i=new Intent(this,Home.class);
        startActivity(i);

    }
    public void bc(View v){
        Intent i=new Intent( MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,CAMERA_REQUEST);

    }
    public void onActivityResult(int requestCode , int resultCode, Intent data){
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK){
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }
}
