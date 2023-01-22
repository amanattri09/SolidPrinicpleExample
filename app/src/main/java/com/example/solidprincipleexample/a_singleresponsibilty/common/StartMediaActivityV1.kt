package com.example.solidprincipleexample.a_singleresponsibilty.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.b_open_closed.example1.problem.MediaActivityV3
import com.example.solidprincipleexample.b_open_closed.example1.common.MEDIA_PLAYER_TYPE

class StartMediaActivityV1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_media)
        findViewById<Button>(R.id.button).setOnClickListener {
            MediaActivityV3.start(this, MEDIA_PLAYER_TYPE.TYPE_NATIVE)
        }
    }
}