package com.example.solidprincipleexample.a_singleresponsibilty.solution.player

import android.content.Context
import com.example.solidprincipleexample.a_singleresponsibilty.common.MEDIA_PLAYER_TYPE
import com.example.solidprincipleexample.a_singleresponsibilty.problem.MediaActivity

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