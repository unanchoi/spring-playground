package com.example.modularmonolithdemo.wallet.infrastructure.db

import com.example.modularmonolithdemo.wallet.domain.PayWalletRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class PayWalletRepositoryAdapter : PayWalletRepository {
    override fun transfer() {
        println("돈 입금")
    }

    override fun withdraw() {
        println("돈 출금")
    }
}