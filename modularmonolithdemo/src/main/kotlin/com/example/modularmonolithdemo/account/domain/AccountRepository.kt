package com.example.modularmonolithdemo.account.domain

interface AccountRepository {
    fun save(account: Account)
    fun delete(account: Account)
}