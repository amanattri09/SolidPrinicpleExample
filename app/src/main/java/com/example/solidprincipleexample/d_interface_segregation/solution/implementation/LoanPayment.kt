package com.example.solidprincipleexample.d_interface_segregation.solution.implementation

import com.example.solidprincipleexample.d_interface_segregation.solution.contracts.ILoan
import com.example.solidprincipleexample.d_interface_segregation.solution.contracts.IPayment
import java.util.*

class LoanPayment : ILoan {

    override fun initateLoanSettlement() {
        TODO("Not yet implemented")
    }

    override fun initiateRePayment() {
        TODO("Not yet implemented")
    }

    override fun getStatus(): List<Objects> {
        TODO("Not yet implemented")
    }

    override fun getPayments(): List<Objects> {
        TODO("Not yet implemented")
    }
}