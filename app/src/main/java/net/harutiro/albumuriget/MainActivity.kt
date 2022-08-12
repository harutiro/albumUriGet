package net.harutiro.albumuriget

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private val launcher = registerForActivityResult(ActivityResultContracts.OpenDocument()) {
        findViewById<ImageView>(R.id.imageView).setImageURI(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.button).setOnClickListener {
            launcher.launch(arrayOf("image/*"))
        }
    }
}