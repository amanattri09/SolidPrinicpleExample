package com.example.solidprincipleexample.b_open_closed.example2

import com.example.solidprincipleexample.b_open_closed.example2.contracts.Print
import com.example.solidprincipleexample.b_open_closed.example2.imp.ImagePrint
import com.example.solidprincipleexample.b_open_closed.example2.imp.TextPrint

object PrintFactory {

    fun getPrintMachine(printType: PrintType) : Print{
       return when(printType){
            PrintType.TYPE_IMAGE->{
                ImagePrint()
            }
            PrintType.TYPE_TEXT->{
                TextPrint()
            }
            else ->{
                TextPrint()
            }
        }
    }


}