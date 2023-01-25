package com.example.solidprincipleexample.a_singleresponsibilty.solution

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.b_open_closed.example1.common.EXTRAS
import com.example.solidprincipleexample.b_open_closed.example1.common.MEDIA_PLAYER_TYPE
import com.example.solidprincipleexample.a_singleresponsibilty.solution.player.IPlayerV1
import com.example.solidprincipleexample.a_singleresponsibilty.solution.player.PlayerFactoryV1
import com.example.solidprincipleexample.b_open_closed.example1.solution.MediActivity_V4

class MediActivity_V2 : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MediActivity_V4::class.java).apply {
                putExtra(EXTRAS.PLAYER_TYPE, MEDIA_PLAYER_TYPE.TYPE_EXO_PLAYER)
            })
        }
    }

    private lateinit var mediaPlayer: IPlayerV1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medi_v2)
        val mediaPlayerType =
            (intent.extras?.getSerializable(EXTRAS.PLAYER_TYPE) as MEDIA_PLAYER_TYPE)
        mediaPlayer = PlayerFactoryV1.getMediaPlayer(mediaPlayerType, this)
        setListener()
    }

    private fun setListener() {
        findViewById<Button>(R.id.btPlaySongV2).setOnClickListener {
            mediaPlayer.start()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.onDestroy()
    }
}