package com.bhanu.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import com.bhanu.lifecycle.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.moveToSecond.setOnClickListener{
            var i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }
        Log.i("LIFECYCLE", "onCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.i("LIFECYCLE", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LIFECYCLE", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LIFECYCLE", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LIFECYCLE", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LIFECYCLE", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LIFECYCLE", "onDestroy")
    }






}