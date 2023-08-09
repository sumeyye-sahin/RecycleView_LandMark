package com.sumeyyesahin.recycleviewtekrar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sumeyyesahin.recycleviewtekrar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val landMarkList = ArrayList<landMark>()

        val pisa = landMark("Pisa", "Italy", R.drawable.pisa)
        val colosseum = landMark("Colosseum", "Italy", R.drawable.colosseum)
        val eiffel = landMark("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = landMark("London Bridge", "England", R.drawable.bridge)

        landMarkList.add(pisa)
        landMarkList.add(colosseum)
        landMarkList.add(eiffel)
        landMarkList.add(londonBridge)

        //not: yanyana : gridlayout , altalta : linearlayout

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkList = Adapter(landMarkList)
        binding.recyclerView.adapter = landmarkList

    }
}