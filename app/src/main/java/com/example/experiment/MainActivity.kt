package com.example.experiment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragment1 = FirstFragment()
        var fragment2 = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            add(R.id.frm2,fragment1,"Fragmentt One")
            commit()
        }



        findViewById<TextView>(R.id.actvitytv).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frm2,fragment2)
                addToBackStack("mxcx,vcn")
//            add(R.id.frm1,fragment1,"Fragment Two")
                commit()
            }
//            Intent(this,SecondActivity::class.java).also {
//                startActivity(it)
//            }
        }

       Log.d("ritik","Main Activity onCreate function   ")

    }

    override fun onStart() {
        super.onStart()
        Log.d("ritik","Main Activity onStart")
     //   var fragment  = supportFragmentManager.findFragmentByTag("Fragment One")
       // var view = fragment?.view?.rootView
     //   Log.d("ritik","${view?.findViewById<TextView>(R.id.f1tv)?.text} sdd")
//        var textView  = findViewById<TextView>(R.id.f1tv)
//          Log.d("ritik",textView.text.toString())  

    }

    override fun onResume() {
        super.onResume()
        Log.d("ritik","Main Activity On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ritik","Main Activity On pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ritik", "Main Activity On Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ritik","Main ACtivity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ritik", "Main Activity onDestroy")
    }



}
