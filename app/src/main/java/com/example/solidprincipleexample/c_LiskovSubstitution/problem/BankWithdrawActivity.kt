package com.example.solidprincipleexample.c_LiskovSubstitution.problem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.c_LiskovSubstitution.solution.CurrentAccountV2
import com.example.solidprincipleexample.c_LiskovSubstitution.solution.FDAccountV2

class BankWithdrawActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank_withdraw)
        //lets withdraw amount
        BankingAppWithdrawalService(CurrentAccount())
        BankingAppWithdrawalService(SavingAccount())
        //this will throw exception
        BankingAppWithdrawalService(FDAccount())
    }
}