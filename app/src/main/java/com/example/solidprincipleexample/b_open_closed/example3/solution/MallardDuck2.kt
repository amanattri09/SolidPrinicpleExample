package com.example.solidprincipleexample.b_open_closed.example3.solution

import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.FlyBehaviour
import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.FlyImp

class MallardDuck2 : Duck2(FlyImp()) {

    override fun display() {
        //looks like mallard duck
    }

}