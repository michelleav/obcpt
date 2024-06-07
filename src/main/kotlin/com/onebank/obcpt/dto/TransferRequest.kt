package com.onebank.obcpt.dto

import com.onebank.obcpt.entity.Transfer
import java.util.*

data class TransferRequest(var senderIBAN: String, var receiverIBAN: String, var amount: Double)
{
    fun toEntity(): Transfer {
        return Transfer(null, senderIBAN, receiverIBAN, amount, Date())
    }
}