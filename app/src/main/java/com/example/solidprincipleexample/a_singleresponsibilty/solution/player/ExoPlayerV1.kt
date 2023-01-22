package com.example.solidprincipleexample.a_singleresponsibilty.solution.player

import android.content.Context
import com.example.solidprincipleexample.b_open_closed.problem.MediaActivityV3
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem

class ExoPlayerV1 constructor(context: Context) : IPlayerV1 {

    private val exoPlayer: ExoPlayer = ExoPlayer.Builder(context).build()

    init {
        exoPlayer.setMediaItem(MediaItem.fromUri(MediaActivityV3.MEDIA_URI))
        exoPlayer.prepare()
    }

    override fun start() {
        if (!exoPlayer.isPlaying) {
            exoPlayer.play();
        }
    }

    override fun stop() {
        exoPlayer.pause()
    }

    override fun onDestroy() {
        exoPlayer.stop()
        exoPlayer.release()
    }
}