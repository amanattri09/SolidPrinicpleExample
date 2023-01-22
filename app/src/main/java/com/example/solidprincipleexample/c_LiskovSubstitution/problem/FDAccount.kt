package com.example.solidprincipleexample.c_LiskovSubstitution.problem

class FDAccount : Account{

    override fun deposit(amount: Int) {
        //Deposit code goes here
    }

    override fun withdraw(amount: Int) {
        throw Exception("Can not withdraw from FD account")
    }
}