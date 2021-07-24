package com.example.foodapp

import Adabter.MyAdabter
import Cache.MySharedPreference

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list__food.*

class List_Food : AppCompatActivity() {
    lateinit var myAdabter: MyAdabter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list__food)


        title="Barcha taomlar"
        MySharedPreference.init(this)
        val list =MySharedPreference.obektString

        myAdabter= MyAdabter(this,list)
        list_food.adapter=myAdabter
        list_food.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this,AboutFood_Activity::class.java)
            intent.putExtra("position",position)
            startActivity(intent)
        }

    }
}