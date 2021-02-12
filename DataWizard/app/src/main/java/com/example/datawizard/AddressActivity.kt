package com.example.datawizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_ADDRESS = "com.example.datawizard.ADDRESS"

class AddressActivity : AppCompatActivity() {

    private var name: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate()")
        setContentView(R.layout.activity_address)
        (findViewById<Button>(R.id.buttonAddressPrev)).setOnClickListener { finish() }

        // Get the Intent that started this activity and extract the name string
        name = intent.getStringExtra(EXTRA_NAME) ?: ""
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

    /** Called when the user taps the Next button */
    fun startNextActivity(view: View) {
        val editTextAddress = findViewById<EditText>(R.id.editTextAddress)
        val address = editTextAddress.text.toString()
        val intent = Intent(this, DateOfBirthActivity::class.java).apply {
            putExtra(EXTRA_NAME, name)
            putExtra(EXTRA_ADDRESS, address)
        }
        startActivity(intent)
    }

    companion object {
        private const val TAG: String = "ADDRESS_ACTIVITY"
    }
}