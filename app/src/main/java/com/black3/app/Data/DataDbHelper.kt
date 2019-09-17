package com.black3.app.Data

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataDbHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    private val db: SQLiteDatabase
    private val values: ContentValues

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "persons"
    }

    init {
        db = this.writableDatabase
        values = ContentValues()
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(
            "CREATE TABLE" + Tables.Persons.TABLE_NAME + " (" + Tables.Persons._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    Tables.Persons.COLUMN_NAME + " TEXT NOT NULL," +
                    Tables.Persons.COLUMS_AGE + " TEXT NOT NULL, " +
                    Tables.Persons.COLUMS_TYPE + " TEXT NOT NULL")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

}