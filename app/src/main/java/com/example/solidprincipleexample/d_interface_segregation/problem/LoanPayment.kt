package com.example.solidprincipleexample.d_interface_segregation.problem

import java.util.*

class LoanPayment : IPayment{

    override fun initiatePayments() {
        throw UnsupportedOperationException("This is not a Bank payment")
    }

    override fun status(): Objects {
        TODO("Not yet implemented")
    }

    override fun getPayments(): List<Objects> {
        TODO("Not yet implemented")
    }

    override fun intiateLoanSettlement() {
        TODO("Not yet implemented")
    }

    override fun initiateRePayment() {
        TODO("Not yet implemented")
    }
}