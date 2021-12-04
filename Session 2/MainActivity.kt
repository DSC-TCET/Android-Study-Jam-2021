package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lifecycle", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "onResume called")
    }
// press home button and see
    override fun onPause() {
        super.onPause()
        Log.d("lifecycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "onDestroy called")
    }
}


//onCreate(), onStart(), onResume(), onPause(), onStop(), and onDestroy()
