package com.petkov.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneModeEnabled = intent!!.getBooleanExtra("state", false)
        print("Is_Airplane_Mode $isAirplaneModeEnabled")
        if(isAirplaneModeEnabled ){
            Toast.makeText(context, "Device is in airplane mode", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Device is not in airplane mode", Toast.LENGTH_SHORT).show()
        }
    }
}