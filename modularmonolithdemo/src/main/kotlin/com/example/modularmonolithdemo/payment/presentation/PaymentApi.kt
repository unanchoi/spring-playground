package com.example.modularmonolithdemo.payment.presentation

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PaymentApi {

    @PostMapping("payments/")
    fun pay(
         @RequestParam memberId: Long
    ) {

    }

}