package com.example.appfinal  //.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import com.example.appfinal.R

class menu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val userBtn = findViewById<ImageButton>(R.id.myUserBtn)
       //val temarioBtn = findViewById<Button>(R.id.temarioBtn)
       // val tareaBtn  = findViewById<Button>(R.id.tareaBtn)
        //val reglaBtn  = findViewById<Button>(R.id.reglaBtn)



              userBtn.setOnClickListener {

          val intent = Intent(this, MyUsser::class.java)
           startActivity(intent)

       }



    }
}