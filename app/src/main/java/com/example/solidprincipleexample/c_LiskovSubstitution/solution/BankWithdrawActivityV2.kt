package com.example.solidprincipleexample.c_LiskovSubstitution.solution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.solidprincipleexample.R
import com.example.solidprincipleexample.c_LiskovSubstitution.problem.BankingAppWithdrawalService

class BankWithdrawActivityV2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank_withdraw)

    }
}