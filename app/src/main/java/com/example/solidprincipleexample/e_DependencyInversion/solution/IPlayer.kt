package com.example.solidprincipleexample.e_DependencyInversion.solution

interface IPlayer {
    val isPlaying: Boolean
    fun start()
    fun stop()
}