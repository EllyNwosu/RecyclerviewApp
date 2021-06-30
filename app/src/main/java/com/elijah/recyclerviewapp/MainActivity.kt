package com.elijah.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.elijah.recyclerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myMusicAdapter: MusicAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val songs : List<MusicModel> = listOf(
            MusicModel(
                songName = "Abule", artistName = "Patoranking", isPlaying = false
            ),
            MusicModel(
                songName = "Good morning Jesus", artistName = "Smith", isPlaying = true
            )
        )
        myMusicAdapter = MusicAdapter(songs)
        binding.recyclerView.adapter = myMusicAdapter

    }
}
