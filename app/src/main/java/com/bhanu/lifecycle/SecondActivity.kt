package com.bhanu.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.view.ActionMode

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //enable action bar arrow

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }
}