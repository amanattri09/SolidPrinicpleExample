package com.example.solidprincipleexample.d_interface_segregation.problem

import java.util.Objects

interface IPayment {
    fun initiatePayments()

    fun status(): Objects

    fun getPayments(): List<Objects>


    /*two methods were added to polute the interface*/

    fun intiateLoanSettlement()

    fun initiateRePayment();
}