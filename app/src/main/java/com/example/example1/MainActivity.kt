package com.example.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe1(view: View){
        val myToast1 = Toast.makeText(this, R.string.correct_answer, Toast.LENGTH_LONG)
        myToast1.show()
    }

    fun toastMe2(view: View){
        val myToast1 = Toast.makeText(this, R.string.incorrect_answer, Toast.LENGTH_LONG)
        myToast1.show()
    }

}
