package com.onebank.event

import com.onebank.obcpt.entity.Transfer
import java.util.*

data class TransferRequest (val senderIBAN:String, val receiverIBAN:String, val amount:Double)
{
    fun toEntity(): Transfer {
        return Transfer(null, senderIBAN, receiverIBAN, amount, Date())
    }
}