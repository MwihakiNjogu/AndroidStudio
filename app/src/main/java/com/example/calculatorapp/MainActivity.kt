package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


   lateinit var display_result:TextView
    lateinit var first_edt: EditText
    lateinit var second_edt: EditText

    lateinit var btn_add: Button
    lateinit var btn_multiply:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //join the two


        first_edt= findViewById(R.id.edtnum1)
        second_edt=findViewById(R.id.edtnum2)
        btn_add=findViewById(R.id.addbtn)

        btn_add.setOnClickListener {
            var num1 = first_edt.text.toString().trim()
            var num2 = second_edt.text.toString().trim()

            //convert to double
            var first_num = num1.toDouble()
            var second_num = num2.toDouble()

            //Result is in double format
            var result = first_num+second_num

            //Convert back to string

            var finalresult = result.toString()

            Toast.makeText(this, finalresult, Toast.LENGTH_SHORT).show()


        }
    }
}