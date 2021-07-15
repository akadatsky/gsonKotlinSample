package com.akadatsky.gsonsample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.akadatsky.gsonsample.model.ExchangeRate
import com.akadatsky.gsonsample.model.PrivatApi
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = GsonBuilder().create()
        val data = gson.fromJson(jsonSample, PrivatApi::class.java)
        val list: List<ExchangeRate> = data.exchangeRate ?: emptyList()

        var result = ""
        list.forEach {
            result += "${it.currency}: ${it.saleRateNB}\n"
        }

        findViewById<TextView>(R.id.textView).text = result

    }
}