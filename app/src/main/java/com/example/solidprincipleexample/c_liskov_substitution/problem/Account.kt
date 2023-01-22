package com.example.solidprincipleexample.c_liskov_substitution.problem

interface Account {
    fun deposit(amount : Int)
    fun withdraw(amount: Int)
}