package com.elijah.recyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elijah.recyclerviewapp.databinding.MusicItemBinding

class MusicAdapter(val songs: List<MusicModel>) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {


    class MusicViewHolder(val binding: MusicItemBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(song: MusicModel) {
            binding.songTitle.text = song.songName
            binding.artist.text = song.artistName

            if (song.isPlaying) {
                binding.imagePlaying.setImageResource(R.drawable.ic_pause)
            }else {
                binding.imagePlaying.setImageResource(R.drawable.ic_play)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val binding: MusicItemBinding = MusicItemBinding.inflate(LayoutInflater.from(parent.context))
        return MusicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
       val song = songs.get(position)
        holder.bind(song)
    }

    override fun getItemCount(): Int {
        return songs.size
    }
}