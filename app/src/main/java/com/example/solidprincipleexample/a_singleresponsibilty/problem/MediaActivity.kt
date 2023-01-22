package com.example.solidprincipleexample.a_singleresponsibilty.problem

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.a_singleresponsibilty.common.EXTRAS
import com.example.solidprincipleexample.a_singleresponsibilty.common.EXTRAS.MEDIA_TYPE
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem


class MediaActivity : AppCompatActivity() {

    private var expPlayer: ExoPlayer? = null
    private var playerType: MEDIA_PLAYER_TYPE = MEDIA_PLAYER_TYPE.TYPE_NATIVE
    private lateinit var nativeMediaPlayer: MediaPlayer
    private lateinit var buttonPlaySong: Button

    companion object {

        const val MEDIA_URI = "asset:///cyber-alarms1.mp3"

        fun start(context: Context, playerType: MEDIA_PLAYER_TYPE) {
            context.startActivity(Intent(context, MediaActivity::class.java).apply {
                putExtra(MEDIA_TYPE, playerType)
            })
        }

        enum class MEDIA_PLAYER_TYPE {
            TYPE_NATIVE,
            TYPE_EXO_PLAYER
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
        nativeMediaPlayer.release();
    }

    private fun setListeners() {
        buttonPlaySong = findViewById(R.id.btnPlaySong)
        buttonPlaySong.setOnClickListener {
            if (playerType == MEDIA_PLAYER_TYPE.TYPE_NATIVE) {
                if (!nativeMediaPlayer.isPlaying) {
                    nativeMediaPlayer.start();
                } else {
                    nativeMediaPlayer.pause()
                }
            } else {
                if (!expPlayer!!.isPlaying) {
                    expPlayer!!.play();
                } else {
                    expPlayer!!.pause()
                }
            }
        }
    }

    private fun init() {
        playerType = intent.getSerializableExtra(EXTRAS.MEDIA_TYPE) as MEDIA_PLAYER_TYPE
        if (playerType == MEDIA_PLAYER_TYPE.TYPE_NATIVE) {
            nativeMediaPlayer = MediaPlayer()
            try {
                nativeMediaPlayer.setDataSource(MEDIA_URI)
                nativeMediaPlayer.prepareAsync()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        } else {
            expPlayer = ExoPlayer.Builder(this).build()
            expPlayer!!.setMediaItem(MediaItem.fromUri(MEDIA_URI))
            expPlayer!!.prepare()
        }
    }
}