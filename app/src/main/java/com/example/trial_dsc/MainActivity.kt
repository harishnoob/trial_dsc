package com.example.trial_dsc


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var etName: EditText
    lateinit var etPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName= findViewById(R.id.etName)
        btnLogin= findViewById(R.id.btnLogin)
        etPassword= findViewById((R.id.etPassword))
            btnLogin.setOnClickListener{
               val status: Unit = (if(etName.text.toString() == "Admin"
                   && etPassword.text.toString() == "DSC@Sastra"
               ){"login successful"
                   val intent= Intent(this, MainActivity2::class.java)
                   startActivity(intent)}; else "login fail") as Unit


            }


    }
    }
