package com.example.solidprincipleexample.a_singleresponsibilty.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.a_singleresponsibilty.problem.MediaActivity

class StartMediaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_media)
        findViewById<Button>(R.id.button).setOnClickListener {
            MediaActivity.start(this, MEDIA_PLAYER_TYPE.TYPE_NATIVE)
        }
    }
}