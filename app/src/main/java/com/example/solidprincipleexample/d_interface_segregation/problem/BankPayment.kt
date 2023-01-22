package com.example.solidprincipleexample.d_interface_segregation.problem

import java.util.*

class BankPayment : IPayment {
    override fun initiatePayments() {
        TODO("Not yet implemented")
    }

    override fun status(): Objects {
        TODO("Not yet implemented")
    }

    override fun getPayments(): List<Objects> {
        TODO("Not yet implemented")
    }

    override fun intiateLoanSettlement() {
        throw UnsupportedOperationException("This is not a loan payment")
    }

    override fun initiateRePayment() {
        throw UnsupportedOperationException("This is not a loan payment")
    }
}