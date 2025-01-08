package com.example.modularmonolithdemo.payment.infrastructure.persistence

import org.springframework.stereotype.Repository

@Repository
interface PaymentDbRepository {
    fun save()
}