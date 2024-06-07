package com.onebank.obcpt.service

import com.onebank.obcpt.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountService(val accountRepository: AccountRepository) {
}