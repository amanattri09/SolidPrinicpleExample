package com.example.solidprincipleexample.b_open_closed.example3.solution

import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.NoFlyImp
import com.example.solidprincipleexample.b_open_closed.example3.solution.quack.SilentDuckImp

class RubberDuck2 : Duck2(NoFlyImp(),SilentDuckImp()){


    override fun quack() {
        //override to squeak
    }

    override fun display() {
        //looks like rubber duck
    }


}