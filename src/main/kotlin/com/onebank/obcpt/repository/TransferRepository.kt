package com.onebank.obcpt.repository

import com.onebank.obcpt.entity.Account
import com.onebank.obcpt.entity.Transfer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferRepository : JpaRepository<Transfer, Long> {
}