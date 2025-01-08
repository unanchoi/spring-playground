package com.example.modularmonolithdemo.transfer.domain

interface TransferRepository {
    fun save(transfer: Transfer): Transfer
}