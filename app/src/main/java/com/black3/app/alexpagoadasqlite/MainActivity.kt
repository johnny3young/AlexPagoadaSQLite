package com.black3.app.alexpagoadasqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.black3.app.alexpagoadasqlite.Models.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var list: MutableList<Person> = ArrayList()
    lateinit var name: String
    lateinit var age: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //addDatos()
        buttonAdd.setOnClickListener {
            operacion()
        }

        listView.onItemClickListener = this

    }

    private fun addDatos() {
        list.add(Person(name, age.toInt()))
        seeData(list)
        editTextName.setText("")
        editTextAge.setText("")
    }

    private fun operacion() {
        name = editTextName?.text.toString()
        age = editTextAge?.text.toString()
        if (name == "") {
            Toast.makeText(this, "Por favor escriba el nombre", Toast.LENGTH_SHORT)
            editTextName.requestFocus()
            return
        } else {
            if (age == "") {
                Toast.makeText(this, "Por favor digite la edad", Toast.LENGTH_SHORT)
                editTextAge.requestFocus()
                return
            }
        }
        Toast.makeText(this, "El nombre es: $name y su edad es: $age", Toast.LENGTH_LONG).show()
    }

    private fun seeData(listData: MutableList<Person>) {
        val adapter = ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1, listData)
        listView.adapter = adapter
    }

    override fun onItemClick (p0: AdapterView<*>?, p1: View?,p2: Int, p3: Long){
        editTextName.setText(list[p2].getName())
        editTextAge.setText(list[p2].getAge().toString())
    }
}
