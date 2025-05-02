package com.example.calculator

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener
import androidx.core.view.WindowInsetsCompat

private val Any.text: Any
    get() {}
private val Int.MAX_VALUE: Any
    get()

private fun Any?.clear() {
    TODO("Not yet implemented")
}

class MainActivity() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    private fun <T> findViewsById(etNum1: Any): Any {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var box: Any = ViewCompat.OVER_SCROLL_ALWAYS.MAX_VALUE.text.Any.layout.Box {
            setOnApplyWindowInsetsListener(/* v = */ findViewById(R.id.textAnswer)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
        val num1 = findViewById<EditText>(R.id.etNum1)
        val num2 = findViewById<EditText>(R.id.etNum2)
        val add = findViewById<Button>(R.id.buttonAdd)
        val result = findViewById<TextView>(R.id.textAnswer)
        add!!.setOnClickListener {
            val numberl = num1. text.toString().toInt(
                val number2 = num2.text.toString().toInt()
            val number1 = null
            val number2 = null
            val sum = number1 + number2
            result.text = "Ssum"

            // added feature
            findViewById<Button>(R.id.buttonClear).setOnClickListener {
                number1?.text.clear()
                number2.text.clear()
                result.text = ""
            }
        }