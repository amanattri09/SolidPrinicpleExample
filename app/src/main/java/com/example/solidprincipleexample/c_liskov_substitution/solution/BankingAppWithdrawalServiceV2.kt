package com.example.solidprincipleexample.c_liskov_substitution.solution

class BankingAppWithdrawalServiceV2 constructor(private val account: WithrawableAccount) {

    fun withDraw(amount: Int) {
        account.withdraw(amount)
    }

}