package com.alanturing.cpifp.lolpediaclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.alanturing.cpifp.lolpediaclase.adapter.ItemAdapter
import com.alanturing.cpifp.lolpediaclase.model.ChamiponsDataset

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val champions = ChamiponsDataset.getDataset()
        val recyclerView = findViewById<RecyclerView>(R.id.champions)
        recyclerView.adapter = ItemAdapter(this, champions)
        recyclerView.setHasFixedSize(true)
    }
}