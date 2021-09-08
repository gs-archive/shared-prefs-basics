package com.gulsah.sharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("shared-pref", MODE_PRIVATE)

        val e = sp.edit()

        /*//kayıt
        //e.putString("ad","Yoda")
        //e.commit()

        //silme
        e.remove("ad").apply()

        //okuma
        val ad = sp.getString("ad", "fail")
        textViewSayac.text = ad*/

        var sayac = sp.getInt("sayac", 0)

        e.putInt("sayac", ++sayac).apply()

        textViewSayac.text = "açılış sayısı : " +sayac.toString()
    }
}