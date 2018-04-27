package com.example.hp.saibalaji;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hp on 4/16/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="harshali";
    public static final String TABLE_NAME ="harshu";
    public static final String COL_1 ="ID";
    public static final String COL_2 ="NAME";
    public static final String COL_3 ="CONTACT";
    public static final String COL_4 ="EMI";
    public static final String COL_5 ="PROBLEM";
    public static final String COL_6 ="SOLUTION";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,CONTACT INTEGER,EMI INTEGER, PROBLEM TEXT,SOLUTION TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

    }


    public boolean insertdata(String nam, String con, String em, String pro, String sol ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,nam);
        contentValues.put(COL_3,con);
        contentValues.put(COL_4,em);
        contentValues.put(COL_5,pro);
        contentValues.put(COL_6,sol);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result == -1)
            return false;
            else
                return true;



    }
    public Cursor getData(String em) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = " SELECT * FROM " + TABLE_NAME + " WHERE COL_4 = '" + em + "'";
        Cursor cursor = db.rawQuery(query, null);
        return cursor;
    }

}
