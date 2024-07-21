package com.petkov.userinteractions

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var showToast: Button
    lateinit var showSnackbar: Button
    lateinit var myLayout: ConstraintLayout
    lateinit var showDialogMessage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.myLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showToast = findViewById(R.id.buttonShowToast)
        showSnackbar = findViewById(R.id.buttonShowSnackbar)
        myLayout = findViewById(R.id.myLayout)
        showDialogMessage = findViewById(R.id.buttonDialogMessage)

        showToast.setOnClickListener {
            Toast.makeText(applicationContext, "This is a toast message", Toast.LENGTH_LONG).show()
        }

        showSnackbar.setOnClickListener {
            Snackbar.make(myLayout, "This is a Snackbar message", Snackbar.LENGTH_INDEFINITE)
                .setAction("Close", View.OnClickListener {
                }).show()
        }

        showDialogMessage.setOnClickListener {
            showAlertDialog()
        }
    }

    fun showAlertDialog() {
        var alertDialog = AlertDialog.Builder(this@MainActivity)

        alertDialog.setTitle("Change")
            .setMessage("Do you want to change the text of the button?")
            .setIcon(R.drawable.warning)
            .setCancelable(false)
            .setNegativeButton("No") { dialogInterface, _ ->
                dialogInterface.cancel()
            }
            .setPositiveButton("Yes") { _, _ ->
                showDialogMessage.text = "Alert Dialog"
            }

        alertDialog.create().show()
    }
}