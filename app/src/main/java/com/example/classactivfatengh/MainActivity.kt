package com.example.classactivfatengh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edName = findViewById<EditText>(R.id.edName)

        val edLoc = findViewById<EditText>(R.id.edLoc)

        val edMobile = findViewById<EditText>(R.id.edMobile)

        val tv = findViewById<TextView>(R.id.tv1)
        val tvBtn = findViewById<Button>(R.id.button2)
        val toaBtn = findViewById<Button>(R.id.button)
        val goBtn = findViewById<Button>(R.id.button3)

        tvBtn.setOnClickListener {
            val name = edName.text.toString()
            val loc = edLoc.text.toString()
            val mobile = edMobile.text.toString()
            tv.text = "Your name : $name , location: $loc , mobil:$mobile"
        }
        toaBtn.setOnClickListener {
            val name = edName.text.toString()
            val loc = edLoc.text.toString()
            val mobile = edMobile.text.toString()
            val myToast = Toast.makeText(applicationContext,"Your name : $name , location: $loc , mobil:$mobile",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.LEFT,200,200)
            myToast.show()
        }
        goBtn.setOnClickListener {
            val name = edName.text.toString()
            val loc = edLoc.text.toString()
            val mobile = edMobile.text.toString()
            val intent = Intent(this, Showsdata::class.java)
            val msg = "Your name : $name , location: $loc , mobil:$mobile"
            intent.putExtra(EXTRA_MESSAGE,msg )
            startActivity(intent)
        }
    }
}