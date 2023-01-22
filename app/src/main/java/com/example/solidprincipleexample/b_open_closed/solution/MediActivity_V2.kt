package com.example.solidprincipleexample.b_open_closed.solution

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.a_singleresponsibilty.solution.MediActivity_V2
import com.example.solidprincipleexample.b_open_closed.common.EXTRAS
import com.example.solidprincipleexample.b_open_closed.common.MEDIA_PLAYER_TYPE
import com.example.solidprincipleexample.a_singleresponsibilty.solution.player.IPlayer
import com.example.solidprincipleexample.a_singleresponsibilty.solution.player.PlayerFactory

class MediActivity_V2 : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MediActivity_V2::class.java).apply {
                putExtra(EXTRAS.PLAYER_TYPE, MEDIA_PLAYER_TYPE.TYPE_EXO_PLAYER)
            })
        }
    }

    private lateinit var mediaPlayer: IPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medi_v2)
        val mediaPlayerType =
            (intent.extras?.getSerializable(EXTRAS.PLAYER_TYPE) as MEDIA_PLAYER_TYPE)
        mediaPlayer = PlayerFactory.getMediaPlayer(mediaPlayerType, this)
    }
}