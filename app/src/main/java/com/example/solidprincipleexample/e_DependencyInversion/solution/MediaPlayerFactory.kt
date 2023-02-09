package com.example.solidprincipleexample.e_DependencyInversion.solution

object MediaPlayerFactory {

    fun getMediaPlayer(): IPlayer {
        return NativeMediaPlayer()
    }

}