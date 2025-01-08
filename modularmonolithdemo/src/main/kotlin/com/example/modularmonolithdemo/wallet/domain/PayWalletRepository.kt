package com.example.modularmonolithdemo.wallet.domain

interface PayWalletRepository {
    fun transfer()
    fun withdraw()
}