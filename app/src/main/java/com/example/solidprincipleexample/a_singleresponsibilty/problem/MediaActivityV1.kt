package com.example.solidprincipleexample.a_singleresponsibilty.problem

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.b_open_closed.common.EXTRAS
import com.example.solidprincipleexample.b_open_closed.common.EXTRAS.PLAYER_TYPE
import com.example.solidprincipleexample.b_open_closed.common.MEDIA_PLAYER_TYPE
import com.example.solidprincipleexample.b_open_closed.problem.MediaActivityV3
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem


class MediaActivityV1 : AppCompatActivity() {

    private var exoPlayer: ExoPlayer? = null
    private var playerType: MEDIA_PLAYER_TYPE = MEDIA_PLAYER_TYPE.TYPE_NATIVE
    private var nativeMediaPlayer: MediaPlayer? = null
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
        nativeMediaPlayer?.stop()
        nativeMediaPlayer?.release();

        exoPlayer?.stop()
        exoPlayer?.release()
    }

    private fun setListeners() {
        buttonPlaySong = findViewById(R.id.btnPlaySong)
        buttonPlaySong.setOnClickListener {
            if (playerType == MEDIA_PLAYER_TYPE.TYPE_NATIVE) {
                nativeMediaPlayer?.let {nativeMediaPlayer->
                    if (!nativeMediaPlayer.isPlaying) {
                        nativeMediaPlayer.start();
                    } else {
                        nativeMediaPlayer.pause()
                    }
                }
            } else {
                exoPlayer?.let {exoPlayer->
                    if (!exoPlayer.isPlaying) {
                        exoPlayer.play();
                    } else {
                        exoPlayer.pause()
                    }
                }
            }
        }
    }

    private fun init() {
        playerType = intent.getSerializableExtra(EXTRAS.PLAYER_TYPE) as MEDIA_PLAYER_TYPE
        if (playerType == MEDIA_PLAYER_TYPE.TYPE_NATIVE) {
            nativeMediaPlayer = MediaPlayer()
            try {
                nativeMediaPlayer!!.setDataSource(MEDIA_URI)
                nativeMediaPlayer!!.prepareAsync()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        } else {
            exoPlayer = ExoPlayer.Builder(this).build()
            exoPlayer!!.setMediaItem(MediaItem.fromUri(MEDIA_URI))
            exoPlayer!!.prepare()
        }
    }
}