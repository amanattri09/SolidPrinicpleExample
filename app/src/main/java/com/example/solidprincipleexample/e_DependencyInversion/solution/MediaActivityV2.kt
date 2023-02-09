package com.example.solidprincipleexample.e_DependencyInversion.solution

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.b_open_closed.example1.common.EXTRAS.PLAYER_TYPE
import com.example.solidprincipleexample.b_open_closed.example1.common.MEDIA_PLAYER_TYPE
import com.example.solidprincipleexample.b_open_closed.example1.problem.MediaActivityV3


class MediaActivityV2  : AppCompatActivity() {

    private lateinit var buttonPlaySong: Button
    private val iPlayer = MediaPlayerFactory.getMediaPlayer()

    companion object {

        fun start(context: Context, playerType: MEDIA_PLAYER_TYPE) {
            context.startActivity(Intent(context, MediaActivityV3::class.java).apply {
                putExtra(PLAYER_TYPE, playerType)
            })
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media)
        setListeners()
    }

    override fun onDestroy() {
        super.onDestroy()
        iPlayer.stop()
    }

    private fun setListeners() {
        buttonPlaySong = findViewById(R.id.btnPlaySong)
        buttonPlaySong.setOnClickListener {
            if (!iPlayer.isPlaying) {
                iPlayer.start();
            } else {
                iPlayer.stop()
            }
        }
    }

}