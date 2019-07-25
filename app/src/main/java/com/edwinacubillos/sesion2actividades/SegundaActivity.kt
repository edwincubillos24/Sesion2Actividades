package com.edwinacubillos.sesion2actividades

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var datosRecibidos = intent.extras
        Toast.makeText(this,datosRecibidos.getString("usuario"), Toast.LENGTH_SHORT).show()
        Log.d("cedula",datosRecibidos.getInt("cedula").toString())

        button.setOnClickListener{
            var intent = Intent()
            intent.putExtra("username","Edwin")
            intent.putExtra("password","123456")
            setResult(Activity.RESULT_OK,intent)
            finish()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this,"ir a actividad Main", Toast.LENGTH_SHORT).show()
    }
}























