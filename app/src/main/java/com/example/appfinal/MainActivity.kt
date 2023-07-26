package com.example.appfinal

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.ui.input.key.KeyEvent
import com.example.appfinal.menu
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.FirebaseUser
import org.w3c.dom.Text


class MainActivity : ComponentActivity() {

    //private lateinit var  bass = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.ussText)
        val editText2 = findViewById<EditText>(R.id.passText)
        val okBtn   = findViewById<Button>(R.id.loginBtn)
        val menss = findViewById<TextView>(R.id.msj)

        var auth = FirebaseAuth.getInstance()

        val drawableId0 = R.drawable.my_fondo
        val drawableId1 = R.drawable.my_android
        menss.text = ""



       /*

        if (editText == "") {

            editText2.isEnabled = true

        }else {
            editText2.isEnabled = false
            menss.text = ""
        }
           */




        okBtn.setOnClickListener {

            val intent = Intent(this,menu::class.java)
            startActivity(intent)
/*
            val email = editText.text.toString()
            val password = editText2.text.toString()

            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this) { task ->

                    if (task.isSuccessful) {

                        menss.text = "loggin ok"

                        val intent = Intent(this,menu::class.java)
                        startActivity(intent)

                    } else {

                        menss.text = "email o contraseña incorrecta"
                    }
                }*/
        }





    }




}



