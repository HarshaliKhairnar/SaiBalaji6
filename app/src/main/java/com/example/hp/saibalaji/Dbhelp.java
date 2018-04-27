package com.example.hp.saibalaji;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hp.saibalaji.Task;

/**
 * Created by hp on 4/26/2018.
 */

public class Dbhelp extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Task.db";
    public static final String TABLE_NAME = "Task_table";

    public static final  String COL_1 = "ID";
    public static final  String COL_2 = "DATAA";

    public  Dbhelp(Context context){
        super (context,DATABASE_NAME, null,1);
    }
@Override
    public  void onCreate(SQLiteDatabase db){
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, DATAA TEXT)");
}
@Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
}
public boolean insertData(String name){
        SQLiteDatabase db = this.getWritableDatabase();
    ContentValues contentValues = new ContentValues();
    contentValues.put(COL_2,name);
    long result = db.insert(TABLE_NAME,null,contentValues);
   // db.close();
    if(result == -1 ){
        return false;
    }else{
        return true;
    }

}
}
