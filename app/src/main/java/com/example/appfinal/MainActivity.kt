package com.example.appfinal

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.ui.input.key.KeyEvent
import com.example.appfinal.menu


class MainActivity : ComponentActivity() {

    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    lateinit var okButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val drawableId0 = R.drawable.my_fondo
        val drawableId1 = R.drawable.my_android

        // if (lastChar == '\n') {
    }


    override fun onResume() {
        super.onResume()

       /* val editText = findViewById<EditText>(R.id.usserText)
        val editText2 = findViewById<EditText>(R.id.passText)


        val inputText = editText.text.toString()

        if (inputText == "Efrain") {

            editText2.isEnabled = true
        }else {
            editText2.isEnabled = false
        }*/

        okButton = findViewById(R.id.okButton)

        okButton.setOnClickListener {
            val intent = Intent(this,menu::class.java)
            startActivity(intent)
            //Toast.makeText(this,contador.toString(),Toast.LENGTH_LONG).show()

        }



    }}
/*
      override fun onPause(){
          super.onPause()



        fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int){
            val texto = editText.text.toString()
            if (texto.isNotEmpty()){

               // textView.text = texto
            }
        }


    }*/

