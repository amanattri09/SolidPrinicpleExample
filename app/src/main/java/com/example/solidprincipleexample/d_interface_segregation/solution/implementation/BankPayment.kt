package com.example.solidprincipleexample.d_interface_segregation.solution.implementation

import com.example.solidprincipleexample.d_interface_segregation.solution.contracts.IBank
import com.example.solidprincipleexample.d_interface_segregation.solution.contracts.IPayment
import java.util.*

class BankPayment : IBank {
    override fun initiatePayments() {
        TODO("Not yet implemented")
    }

    override fun getStatus(): List<Objects> {
        TODO("Not yet implemented")
    }

    override fun getPayments(): List<Objects> {
        TODO("Not yet implemented")
    }
}