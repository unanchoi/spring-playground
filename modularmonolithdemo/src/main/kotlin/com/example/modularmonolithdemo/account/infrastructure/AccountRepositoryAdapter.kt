package com.example.modularmonolithdemo.account.infrastructure

import com.example.modularmonolithdemo.account.domain.Account
import com.example.modularmonolithdemo.account.domain.AccountRepository
import org.springframework.stereotype.Component

@Component
class AccountRepositoryAdapter : AccountRepository {
    override fun save(account: Account) {
        TODO("Not yet implemented")
    }

    override fun delete(account: Account) {
        TODO("Not yet implemented")
    }
}