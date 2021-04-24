package com.dawncodes.abdihakimportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ContactUs : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
        button = findViewById(R.id.buttonMyName)
        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Abdihakim Muhumed Sheikh",Toast.LENGTH_LONG).show()
        })

    }
}