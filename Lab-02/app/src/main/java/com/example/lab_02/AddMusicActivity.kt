package com.example.lab_02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_02.databinding.ActivityAddMusicBinding
import com.example.lab_02.recyclerview.Music

class AddMusicActivity: AppCompatActivity() {
    private lateinit var binding: ActivityAddMusicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.edtName.text.toString()
            val singer = binding.edtSinger.text.toString()

            val music = Music(name, singer)

            MainActivity.Musics.add(music)


            finish()
        }
    }
}