package com.onebank.obcpt.producer

import com.onebank.obcpt.constants.TRANSFER_TOPIC
import com.onebank.event.TransferRequest
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class TransferProducer (
    private val kafkaTemplate: KafkaTemplate<String, TransferRequest>
) {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    fun sendTransferMessage(request: TransferRequest) {
        kafkaTemplate.send(TRANSFER_TOPIC, request)
        logger.info("Transfer message sent: [$request]")
    }
}