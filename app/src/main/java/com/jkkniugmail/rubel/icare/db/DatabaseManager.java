package com.jkkniugmail.rubel.icare.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by islan on 2/19/2017.
 */

public class DatabaseManager {
    private DatabaseHelper helper;
    private SQLiteDatabase database;

    public DatabaseManager(Context context) {
        helper = new DatabaseHelper(context);
    }

    private void openDatabase() {
        database = helper.getWritableDatabase();

    }

    private void closeDatabase() {
        database.close();
        helper.close();
    }
}
