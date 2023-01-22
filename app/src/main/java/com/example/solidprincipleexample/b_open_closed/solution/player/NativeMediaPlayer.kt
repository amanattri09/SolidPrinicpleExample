package com.example.solidprincipleexample.a_singleresponsibilty.solution.player

import android.media.MediaPlayer
import com.example.solidprincipleexample.b_open_closed.problem.MediaActivity

class NativeMediaPlayer : IPlayer {

    private val nativeMediaPlayer = MediaPlayer()
    init {
        nativeMediaPlayer.setDataSource(MediaActivity.MEDIA_URI)
        nativeMediaPlayer.prepareAsync()
    }

    override fun start() {
        if (!nativeMediaPlayer.isPlaying) {
            nativeMediaPlayer.start();
        } else {
            nativeMediaPlayer.pause()
        }
    }

    override fun stop() {
        nativeMediaPlayer.stop()
    }

    override fun onDestroy() {
        nativeMediaPlayer.stop()
        nativeMediaPlayer.release()
    }
}