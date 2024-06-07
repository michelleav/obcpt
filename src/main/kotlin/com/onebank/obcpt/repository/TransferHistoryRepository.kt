package com.onebank.obcpt.repository

import com.onebank.obcpt.entity.TransferHistory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferHistoryRepository : JpaRepository<TransferHistory, Long> {
}