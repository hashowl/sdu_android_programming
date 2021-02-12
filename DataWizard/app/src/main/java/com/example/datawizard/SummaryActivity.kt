package com.example.datawizard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SummaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate()")
        setContentView(R.layout.activity_summary)
        (findViewById<Button>(R.id.buttonSummaryPrev)).setOnClickListener { finish() }

        // Get the Intent that started this activity and extract the name, address and date of birth strings
        val name = intent.getStringExtra(EXTRA_NAME) ?: ""
        val address = intent.getStringExtra(EXTRA_ADDRESS) ?: ""
        val dateOfBirth = intent.getStringExtra(EXTRA_DATE_OF_BIRTH) ?: ""

        // Capture the layout's TextViews and set their text properties to the corresponding strings
        findViewById<TextView>(R.id.textViewName).apply {
            text = name
        }
        findViewById<TextView>(R.id.textViewAddress).apply {
            text = address
        }
        findViewById<TextView>(R.id.textViewDateOfBirth).apply {
            text = dateOfBirth
        }
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

    companion object {
        private const val TAG: String = "SUMMARY_ACTIVITY"
    }
}