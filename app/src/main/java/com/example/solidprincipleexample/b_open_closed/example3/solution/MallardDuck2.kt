package com.example.solidprincipleexample.b_open_closed.example3.solution

import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.FlyBehaviour
import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.FlyImp
import com.example.solidprincipleexample.b_open_closed.example3.solution.quack.QuackBehaviour
import com.example.solidprincipleexample.b_open_closed.example3.solution.quack.SqueakImp

class MallardDuck2 : Duck2(FlyImp(),SqueakImp()) {

    override fun display() {
        //looks like mallard duck
    }

}