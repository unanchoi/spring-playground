package com.example.modularmonolithdemo.transfer.infrastructure

import com.example.modularmonolithdemo.transfer.domain.Transfer
import com.example.modularmonolithdemo.transfer.domain.TransferRepository

class TransferRepositoryAdapter : TransferRepository {
    override fun save(transfer: Transfer): Transfer {
        TODO("Not yet implemented")
    }
}