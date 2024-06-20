package com.onebank.obcpt.service

import com.onebank.event.TransferRequest
import com.onebank.event.TransferResponse
import com.onebank.obcpt.repository.TransferRepository
import org.springframework.stereotype.Service

@Service
class TransferService(val transferRepository: TransferRepository) {
    fun createTransfer(newTransfer: TransferRequest): TransferResponse {
        var transfer = newTransfer.toEntity()
        transferRepository.save(transfer)
        return TransferResponse(message = "Transfer was successfully")
    }
}