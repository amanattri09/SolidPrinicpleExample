package com.example.solidprincipleexample.c_LiskovSubstitution.solution

class CurrentAccountV2 : WithrawableAccount {

    override fun deposit(amount: Int) {
        //Deposit code goes here
    }

    override fun withdraw(amount: Int) {
        // withdraw code goes here
    }
}