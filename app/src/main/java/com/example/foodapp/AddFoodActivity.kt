package com.example.foodapp

import Cache.MySharedPreference
import Model.Food
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)

        title = "Taom qo'shish"

        MySharedPreference.init(this)

        btn_save.setOnClickListener {
            val name = edt_food_name.text.toString().trim()
            val product = edt_food_product.text.toString().trim()
            val preparationOrder = edt_preparation_oder.text.toString().trim()

            if (name != "" && product !== "" && preparationOrder != "") {
                val list =MySharedPreference.obektString
                list.add(Food(name, product, preparationOrder))
                MySharedPreference.obektString=list
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
                finish()
            } else {

                Toast.makeText(this, "Not saved", Toast.LENGTH_SHORT).show()
            }
        }

    }
}