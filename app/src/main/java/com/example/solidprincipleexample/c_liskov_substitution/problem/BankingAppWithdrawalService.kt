package com.example.solidprincipleexample.c_liskov_substitution.problem

class BankingAppWithdrawalService constructor(private val account: Account) {

    fun withDraw(amount: Int) {
        account.withdraw(amount)
        //not to do this
        if(!(account is FDAccount)){
            account.withdraw(amount)
        }
    }

}