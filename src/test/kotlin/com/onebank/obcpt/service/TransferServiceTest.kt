package com.onebank.obcpt.service

import com.onebank.event.TransferRequest
import com.onebank.obcpt.repository.TransferRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class TransferServiceTest() {

    private lateinit var transferService: TransferService
    @Mock
    private lateinit var transferRepository: TransferRepository

    @BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        transferService = TransferService(transferRepository)
    }
    @Test
    fun createNewTransfer() {
        // given
        var transfer = TransferRequest("IBAN9865431009","IBAN7650002104",1000.00)

        // when
        val result = transferService.createTransfer(transfer)

        // then
        assertEquals("Transfer was successfully", result.message)
    }
}