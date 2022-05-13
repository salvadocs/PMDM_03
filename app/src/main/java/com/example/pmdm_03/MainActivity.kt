package com.example.pmdm_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = fragment1()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainerView, fragment1).commit()



        /*
          boton2.setOnClickListener {

              val transaction = supportFragmentManager.beginTransaction()
              val fragmento = fragment3()

              transaction.replace(R.id.fragmentContainerView2, fragmento)
              transaction.addToBackStack(null)
              transaction.commit()
          }

          boton3.setOnClickListener {

              val transaction = supportFragmentManager.beginTransaction()
              val fragmento = fragment4()

              transaction.replace(R.id.fragmentContainerView2, fragmento)
              transaction.addToBackStack(null)
              transaction.commit()
          }
        */


    }


}