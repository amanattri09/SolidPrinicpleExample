package com.example.solidprincipleexample.c_liskov_substitution.solution

class SavingAccountV2 : WithrawableAccount {

    override fun deposit(amount: Int) {
        //Deposit code goes here
    }

    override fun withdraw(amount: Int) {
        // withdraw code goes here
    }
}