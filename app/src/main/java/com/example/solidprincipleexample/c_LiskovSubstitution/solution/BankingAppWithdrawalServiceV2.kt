package com.example.solidprincipleexample.c_LiskovSubstitution.solution

class BankingAppWithdrawalServiceV2 constructor(private val account: WithrawableAccount) {

    fun withDraw(amount: Int) {
        account.withdraw(amount)
    }

}