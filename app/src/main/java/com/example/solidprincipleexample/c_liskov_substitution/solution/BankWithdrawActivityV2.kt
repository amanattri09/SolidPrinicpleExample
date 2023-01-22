package com.example.solidprincipleexample.c_liskov_substitution.solution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solidprincipleexample.R

class BankWithdrawActivityV2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank_withdraw)

        BankingAppWithdrawalServiceV2(SavingAccountV2())
        BankingAppWithdrawalServiceV2(CurrentAccountV2())
    }
}