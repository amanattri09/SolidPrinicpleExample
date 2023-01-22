package com.example.solidprincipleexample.c_liskov_substitution.solution

interface WithrawableAccount : AccountV2{
    fun withdraw(amount: Int)
}