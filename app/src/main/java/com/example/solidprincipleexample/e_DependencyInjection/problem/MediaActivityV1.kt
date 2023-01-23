package com.example.solidprincipleexample.e_DependencyInjection.problem

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.b_open_closed.example1.common.EXTRAS
import com.example.solidprincipleexample.b_open_closed.example1.common.EXTRAS.PLAYER_TYPE
import com.example.solidprincipleexample.b_open_closed.example1.common.MEDIA_PLAYER_TYPE
import com.example.solidprincipleexample.b_open_closed.example1.problem.MediaActivityV3
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem


class MediaActivityV1 : AppCompatActivity() {

    private var nativeMediaPlayer = NativeMediaPlayer()
    private lateinit var buttonPlaySong: Button

    companion object {

        const val MEDIA_URI = "asset:///cyber-alarms1.mp3"

        fun start(context: Context, playerType: MEDIA_PLAYER_TYPE) {
            context.startActivity(Intent(context, MediaActivityV3::class.java).apply {
                putExtra(PLAYER_TYPE, playerType)
            })
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media)
        init()
        setListeners()
    }

    override fun onDestroy() {
        super.onDestroy()
        nativeMediaPlayer.stop()
    }

    private fun setListeners() {
        buttonPlaySong = findViewById(R.id.btnPlaySong)
        buttonPlaySong.setOnClickListener {
                    if (!nativeMediaPlayer.isPlaying) {
                        nativeMediaPlayer.start();
                    } else {
                        nativeMediaPlayer.pause()
                    }
                }
        }

    private fun init() {
        nativeMediaPlayer.init(MEDIA_URI)
    }
}