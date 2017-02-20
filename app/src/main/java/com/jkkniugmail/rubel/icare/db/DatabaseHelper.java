package com.jkkniugmail.rubel.icare.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by islan on 2/19/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    //database
    public static final String DATABASE_NAME = "i_care";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_USER = "user";
    public static final String COL_USER_ID = "id";
    public static final String COL_USER_NAME = "name";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        super.onOpen(db);
        if (!db.isReadOnly()) {
            // Enable foreign key constraints
            db.execSQL("PRAGMA foreign_keys=ON;");
        }
    }
}
