package com.peter.recyclerviewpractice

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewpractice.databinding.ActivityMainBinding
import com.peter.recyclerviewpractice.databinding.ItemListBinding

class RecyclerViewAdapter : RecyclerViewHolder() {


}


class RecyclerViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root){

    fun setListNumber(listNumber : String){
        binding.listNumber.text = listNumber
    }

    fun setEnglish(english : String){
        binding.english.text = english
    }

    fun setKorean(korean : String){
        binding.korean.text = korean
    }

}