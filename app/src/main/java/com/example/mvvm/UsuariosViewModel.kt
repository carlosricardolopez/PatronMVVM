package com.example.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UsuariosViewModel : ViewModel() {
    private val listaUsuarios = MutableLiveData<List<Usuario>>()

    init {
        cargarUsuarios()
    }

    private fun cargarUsuarios() {
        val usuarios = listOf(
            Usuario("Juan", 25),
            Usuario("María", 30),
            Usuario("Pedro", 28),
            Usuario("Luisa", 35)
        )
        listaUsuarios.value = usuarios
    }

    fun obtenerUsuarios(): MutableLiveData<List<Usuario>> {
        return listaUsuarios
    }
}