package com.example.solidprincipleexample.c_LiskovSubstitution.solution

interface WithrawableAccount : AccountV2{
    fun withdraw(amount: Int)
}