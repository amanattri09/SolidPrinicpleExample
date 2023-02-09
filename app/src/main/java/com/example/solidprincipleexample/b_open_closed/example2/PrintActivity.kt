package com.example.solidprincipleexample.b_open_closed.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.b_open_closed.example2.contracts.Print

class PrintActivity : AppCompatActivity() {

    private val print: Print = PrintFactory.getPrintMachine(PrintType.TYPE_TEXT)
    //or
    /*@Inject
    lateinit var printer : Print*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print)
        findViewById<Button>(R.id.printButton).setOnClickListener {
            print.printOnePage()
        }

        findViewById<Button>(R.id.printButton).setOnClickListener {
            print.printAllPage()
        }
    }
}