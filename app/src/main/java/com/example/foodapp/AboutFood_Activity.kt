package com.example.foodapp


import Cache.MySharedPreference
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about_food_.*

class AboutFood_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_food_)

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString
        val position=intent.getIntExtra("position",0)
        txt_name.text=list[position].name
        txt_food_product.text=list[position].ingradient
        txt_preparation_order.text=list[position].preparitionOrder
    }
}