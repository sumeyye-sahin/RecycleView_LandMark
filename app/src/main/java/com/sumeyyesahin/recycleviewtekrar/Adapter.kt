package com.sumeyyesahin.recycleviewtekrar

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sumeyyesahin.recycleviewtekrar.databinding.RecycleRowBinding

class Adapter(val landmarkList : ArrayList<landMark>) : RecyclerView.Adapter<Adapter.LandmarkHolder>() {

    class LandmarkHolder(val binding: RecycleRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding =RecycleRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {

       // val intent = Intent(holder.itemView.context,DetailActivity::class.java)
       // MySingleton.chosenLandmark = landmarkList.get(position)
        //holder.itemView.context.startActivity(intent)

        holder.binding.nameText.text = landmarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailActivity::class.java)
            MySingleton.chosenLandmark = landmarkList.get(position)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int { // kaç adet listeleyeceksek itemi o itemın sayısını yazmamız lazım.
        return landmarkList.size
    }
}