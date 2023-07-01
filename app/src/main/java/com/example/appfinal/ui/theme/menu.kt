package com.example.appfinal  //.ui.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.appfinal.R

class menu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)



        val drawableId0 = R.drawable.picmenu
    }

    override fun onResume() {
        super.onResume()

        //val drawableId0 = R.drawable.picmenu
    }
}