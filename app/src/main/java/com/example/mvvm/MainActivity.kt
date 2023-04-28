package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var usuariosViewModel: UsuariosViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.textViewUsuarios)
        usuariosViewModel = ViewModelProvider(this).get(UsuariosViewModel::class.java)

        usuariosViewModel.obtenerUsuarios().observe(this, Observer { usuarios ->
            myTextView.text = usuarios.toString()
        })
    }
}