package com.felcadev.show_hidden_password

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {

    var isVis = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showHiddenPassword(view: View){

        val etPassword = findViewById<EditText>(R.id.etPassword)
        val ibPassword = findViewById<ImageButton>(R.id.ibPassword)

        if (this.isVis){
            ibPassword.setImageDrawable(getDrawable(R.drawable.ic_baseline_visibility_off_24))
            etPassword.transformationMethod = PasswordTransformationMethod.getInstance()
        }else{
            ibPassword.setImageDrawable(getDrawable(R.drawable.ic_baseline_remove_red_eye_24))
            etPassword.transformationMethod = HideReturnsTransformationMethod.getInstance()

        }

        etPassword.setSelection(etPassword.length())
        this.isVis = !this.isVis
    }


}