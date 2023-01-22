package com.example.solidprincipleexample.a_singleresponsibilty.solution.player

import android.content.Context
import com.example.solidprincipleexample.b_open_closed.common.MEDIA_PLAYER_TYPE

object PlayerFactory {

    fun getMediaPlayer(playerType: MEDIA_PLAYER_TYPE, context: Context): IPlayer {
        return when (playerType) {
            MEDIA_PLAYER_TYPE.TYPE_NATIVE ->
                NativeMediaPlayer()
            MEDIA_PLAYER_TYPE.TYPE_EXO_PLAYER -> {
                ExoPlayer(context)
            }
            else -> {
                NativeMediaPlayer()
            }
        }
    }

}