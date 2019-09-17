package com.black3.app.Data

import com.black3.app.alexpagoadasqlite.Models.Person

class Tables {

    abstract class Persons {
        companion object {
            val _ID = "_id"
            val TABLE_NAME = "persons"
            val COLUMN_NAME = "name"
            val COLUMS_AGE = "age"
            val COLUMS_TYPE = "type"
            var persons : MutableList<Person> = ArrayList()
        }
    }
}