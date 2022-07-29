package com.harman.login_application

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Implicit_intent : AppCompatActivity() {
    lateinit var btndial : Button
    lateinit var btnsms : Button
    lateinit var btnshare : Button
    lateinit var btnrating : Button
    lateinit var btnemail : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)
        btndial = findViewById(R.id.btndial)
         btnsms =findViewById(R.id.btnsms)
        btnshare =findViewById(R.id.btnshare)
         btnrating =findViewById(R.id.btnrating)
        btnemail=findViewById(R.id.btnemail)
        btndial.setOnClickListener{
            System.out.println("Clicked")
            var intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("tel:" +"9555533444")
            startActivity(intent)
        }
        btnsms.setOnClickListener{
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("sms:"+"9782244444")
            startActivity(intent)
        }
        btnshare.setOnClickListener{
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_SEND)
            intent.data= Uri.parse("text:"+"hlo")
            startActivity(intent)
        }
        btnrating.setOnClickListener{
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("rating:"+"")
            startActivity(intent)
        }
        btnemail.setOnClickListener{
            System.out.println("Clicked")
            val intent = Intent(Intent.ACTION_SEND)
            intent.data= Uri.parse("email:"+"kh69@gmail.com")
            startActivity(intent)
        }
    }
}