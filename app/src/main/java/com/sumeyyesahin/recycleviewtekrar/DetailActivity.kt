package com.sumeyyesahin.recycleviewtekrar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sumeyyesahin.recycleviewtekrar.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val selectedlandMark= MySingleton.chosenLandmark

        selectedlandMark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            val resourceID = it.image
            binding.imageView.setImageResource(resourceID)
        }
    }
}