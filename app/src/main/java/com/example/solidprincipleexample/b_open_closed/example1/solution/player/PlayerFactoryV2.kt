package com.example.solidprincipleexample.a_singleresponsibilty.solution.player

import android.content.Context
import com.example.solidprincipleexample.b_open_closed.example1.common.MEDIA_PLAYER_TYPE

object PlayerFactoryV2 {

    fun getMediaPlayer(playerType: MEDIA_PLAYER_TYPE, context: Context): IPlayerV1 {
        return when (playerType) {
            MEDIA_PLAYER_TYPE.TYPE_NATIVE ->
                NativeMediaPlayerV1()
            MEDIA_PLAYER_TYPE.TYPE_EXO_PLAYER -> {
                ExoPlayerV1(context)
            }
            else -> {
                NativeMediaPlayerV1()
            }
        }
    }

}