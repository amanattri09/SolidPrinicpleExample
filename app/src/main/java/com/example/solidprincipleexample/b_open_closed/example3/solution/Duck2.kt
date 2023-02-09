package com.example.solidprincipleexample.b_open_closed.example3.solution

import com.example.solidprincipleexample.b_open_closed.example3.solution.fly.FlyBehaviour
import com.example.solidprincipleexample.b_open_closed.example3.solution.quack.QuackBehaviour

open class Duck2 constructor(val flyBehaviour: FlyBehaviour,val quackBehaviour: QuackBehaviour) {

    open  fun swim(){
        //swim code goes here
    }

    open  fun quack(){
        quackBehaviour.quack()
    }

    open fun display(){

    }

    open fun fly(){
        flyBehaviour.fly()
    }
}