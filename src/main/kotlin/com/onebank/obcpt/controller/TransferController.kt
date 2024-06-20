package com.onebank.obcpt.controller

import com.onebank.event.TransferRequest
import com.onebank.event.TransferResponse
import com.onebank.obcpt.producer.TransferProducer
import com.onebank.obcpt.service.TransferService
import org.springframework.web.bind.annotation.*
@RestController
@RequestMapping("/obcpt/transfer")
class TransferController(private val transferService: TransferService,
        private val transferProducer: TransferProducer) {
    @PostMapping
    fun createTransfer(@RequestBody newTransferRequest: TransferRequest): TransferResponse {
        var response = transferService.createTransfer(newTransferRequest)
        transferProducer.sendTransferMessage(newTransferRequest)
        return response
    }
}