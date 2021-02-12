package com.example.datawizard

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_DATE_OF_BIRTH = "com.example.datawizard.DATE_OF_BIRTH"

class DateOfBirthActivity : AppCompatActivity() {

    private var name: String = ""
    private var address: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate()")
        setContentView(R.layout.activity_date_of_birth)
        (findViewById<Button>(R.id.buttonDateOfBirthPrev)).setOnClickListener { finish() }

        // Get the Intent that started this activity and extract the name and address strings
        name = intent.getStringExtra(EXTRA_NAME) ?: ""
        address = intent.getStringExtra(EXTRA_ADDRESS) ?: ""
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
        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val dateOfBirth = String.format(
            "%02d/%02d/%d",
            datePicker.month + 1,
            datePicker.dayOfMonth,
            datePicker.year
        )
        val intent = Intent(this, SummaryActivity::class.java).apply {
            putExtra(EXTRA_NAME, name)
            putExtra(EXTRA_ADDRESS, address)
            putExtra(EXTRA_DATE_OF_BIRTH, dateOfBirth)
        }
        startActivity(intent)
    }

    companion object {
        private const val TAG: String = "DATE_OF_BIRTH_ACTIVITY"
    }
}