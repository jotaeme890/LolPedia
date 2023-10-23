package com.alanturing.cpifp.lolpediaclase.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alanturing.cpifp.lolpediaclase.R
import com.alanturing.cpifp.lolpediaclase.model.Champion

class ItemAdapter(private val _context: Context, private val _datasetChamps: List<Champion>)
                    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val _view: View):RecyclerView.ViewHolder(_view) {
        val textView: TextView = _view.findViewById(R.id.champion_name)
        val imageView: ImageView = _view.findViewById(R.id.champion_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = _datasetChamps.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val champion = _datasetChamps[position]
        holder.textView.text = _context.getString(champion.championStringId)
        holder.imageView.setImageResource(champion.championImageId)
    }
}