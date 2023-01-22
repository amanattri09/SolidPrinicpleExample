package com.example.solidprincipleexample.d_interface_segregation.solution.contracts

interface ILoan : IPayment{
    fun initateLoanSettlement()
    fun initiateRePayment()
}