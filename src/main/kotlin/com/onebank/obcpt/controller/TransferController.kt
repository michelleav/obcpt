package com.onebank.obcpt.controller

import com.onebank.obcpt.dto.TransferRequest
import com.onebank.obcpt.dto.TransferResponse
import com.onebank.obcpt.service.TransferService
import org.springframework.web.bind.annotation.*

@RequestMapping("/obcpt/transfer")
@RestController
class TransferController(val transferService: TransferService) {
    @PostMapping
    fun createTransfer(@RequestBody newTransferRequest: TransferRequest): TransferResponse = transferService.createTransfer(newTransferRequest)
}