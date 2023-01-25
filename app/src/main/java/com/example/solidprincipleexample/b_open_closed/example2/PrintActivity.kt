package com.example.solidprincipleexample.b_open_closed.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.b_open_closed.example2.contracts.Print
import com.example.solidprincipleexample.b_open_closed.example2.imp.TextPrint

class PrintActivity : AppCompatActivity() {

    private val print: Print = PrintFactory.getPrintMachine(PrintType.TYPE_TEXT)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print)
    }
}