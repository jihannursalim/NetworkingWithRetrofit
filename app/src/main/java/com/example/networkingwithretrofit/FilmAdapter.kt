package com.example.networkingwithretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.networkingwithretrofit.databinding.ItemFilmBinding
import com.example.networkingwithretrofit.film.ResponseDataFilmItem

class FilmAdapter(var listFilm : List<ResponseDataFilmItem>) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    class ViewHolder(var binding : ItemFilmBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        holder.binding.txtJudulFilm.text = listFilm[position].name
        holder.binding.txtTanggal.text = listFilm[position].date
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }
}