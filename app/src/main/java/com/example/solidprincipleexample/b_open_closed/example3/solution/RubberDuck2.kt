package com.example.solidprincipleexample.b_open_closed.example3.solution

import com.example.solidprincipleexample.b_open_closed.example3.solution.Duck2
import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.NoFlyImp

class RubberDuck2 : Duck2(NoFlyImp()){


    override fun quack() {
        //override to squeak
    }

    override fun display() {
        //looks like rubber duck
    }


}