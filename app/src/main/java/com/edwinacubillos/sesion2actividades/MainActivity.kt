package com.edwinacubillos.sesion2actividades

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("metodo", "onCreate")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.mActividadDos -> {
                Toast.makeText(this,"ir a actividad 2", Toast.LENGTH_SHORT).show()
                var intent = Intent(this,SegundaActivity::class.java)
                intent.putExtra("usuario","edwinacubillos")
                intent.putExtra("cedula", 986)
                startActivityForResult(intent,1234)
            }

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1234 && resultCode == Activity.RESULT_OK){
            Log.d("username", data!!.extras.getString("username"))
            Log.d("password", data!!.extras.getString("password"))
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d("metodo", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("metodo", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("metodo", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("metodo", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("metodo", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("metodo", "onDestroy")
    }
}
