package com.decagon.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //sets the view for this activity to the specified layout

        val switch: Switch = findViewById(R.id.switchButton) //This finds the switch view for toggling between night mode and light mode in the xml layout

        switch.setOnClickListener() { //This sets an onClickListener to the switch view

            if (switch.isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) //If switch view is checked, Night mode comes on
            } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO) //else Night mode is off and light mode comes on
            }
        }
    }
}