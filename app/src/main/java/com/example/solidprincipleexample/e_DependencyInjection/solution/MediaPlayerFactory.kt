package com.example.solidprincipleexample.e_DependencyInjection.solution

object MediaPlayerFactory {

    fun getMediaPlayer(): IPlayer {
        return NativeMediaPlayer()
    }

}