package com.example.ejemplofloatingsnack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var miCoordinator: CoordinatorLayout
    lateinit var txtVentana: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtVentana = findViewById(R.id.txt_letreto)
        var buttonFab: FloatingActionButton = findViewById(R.id.fab_op1)

        miCoordinator = findViewById(R.id.coodinator_activity)

        buttonFab.setOnClickListener{
            txtVentana.text ="Se presionó"
            SendSnackbar()
            Log.e(this.toString(),"si sirve")

        }

    }

    fun SendSnackbar(){
        Snackbar.make(miCoordinator, "Se presionó",Snackbar.LENGTH_SHORT)
      //  Log.e(this.toString(), "SnackBar")
        // el Snackbar tiene l aposibilidad de generar acciones
            .setAction("Cambia", View.OnClickListener{
                 txtVentana.text= "Presionó SnackBar"
                // en esta parte se puede hacer cualquier cosa
                // cambio de datos ETC
            })
            .show()
    }
}