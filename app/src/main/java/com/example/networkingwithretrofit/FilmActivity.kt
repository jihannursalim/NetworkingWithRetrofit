package com.example.networkingwithretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.networkingwithretrofit.R
import com.example.networkingwithretrofit.databinding.ActivityFilmBinding

class FilmActivity : AppCompatActivity() {

    lateinit var binding: ActivityFilmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun getDataFilm(){

    }
}