package com.example.datawizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_NAME = "com.example.datawizard.NAME"

class NameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate()")
        setContentView(R.layout.activity_name)
        (findViewById<Button>(R.id.buttonExit)).setOnClickListener { finish() }
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState()")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState()")
    }

    /** Called when the user taps the Next button */
    fun startNextActivity(view: View) {
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val name = editTextName.text.toString()
        val intent = Intent(this, AddressActivity::class.java).apply {
            putExtra(EXTRA_NAME, name)
        }
        startActivity(intent)
    }

    companion object {
        private const val TAG: String = "NAME_ACTIVITY"
    }
}