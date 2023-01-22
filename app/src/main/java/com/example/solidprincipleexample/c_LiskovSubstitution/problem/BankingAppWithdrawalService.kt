package com.example.solidprincipleexample.c_LiskovSubstitution.problem

class BankingAppWithdrawalService constructor(private val account: Account) {

    fun withDraw(amount: Int) {
        account.withdraw(amount)
        //not to do this
        if(!(account is FDAccount)){
            account.withdraw(amount)
        }
    }

}