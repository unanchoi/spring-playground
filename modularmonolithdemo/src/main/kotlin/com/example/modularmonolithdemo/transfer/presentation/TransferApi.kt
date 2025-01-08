package com.example.modularmonolithdemo.transfer.presentation

import com.example.modularmonolithdemo.transfer.application.TransferService
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TransferApi(
    private val transferService: TransferService
) {

    fun charge(
        @RequestParam memberId: Long
    ) {
        transferService.charge()
    }

    fun 전환(
        @RequestParam memberId: Long
    ) {}

    fun transfer(
        @RequestParam memberId: Long
    ) {
        transferService.transfer()
    }

}