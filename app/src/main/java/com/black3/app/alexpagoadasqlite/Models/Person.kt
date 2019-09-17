package com.black3.app.alexpagoadasqlite.Models

class Person {
    private var id : Int = 0
    private var name : String = ""
    private var age : Int = 0
    private var type : String = ""

    constructor( name: String, age: Int) {
        //this.id = id
        this.name = name
        this.age = age
        //this.type = type
    }

    fun getId() : Int {
        return id
    }
    fun getName() : String {
        return  name
    }
    fun getAge() : Int {
        return age
    }
    fun getType() : String {
        return type
    }

    override fun toString(): String {
        return name
    }
}