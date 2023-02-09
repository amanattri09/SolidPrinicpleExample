package com.example.solidprincipleexample.b_open_closed.example3.solution

import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.FlyBehaviour

open class Duck2 constructor(val flyBehaviour: FlyBehaviour) {

    open  fun swim(){

    }

    open  fun quack(){

    }

    open fun display(){

    }

    open fun fly(){
        flyBehaviour.fly()
    }
}