package com.example.solidprincipleexample.d_interface_segregation.solution.contracts

import java.util.Objects

interface IPayment {
    fun getStatus():List<Objects>
    fun getPayments() : List<Objects>
}