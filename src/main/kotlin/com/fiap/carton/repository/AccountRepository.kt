package com.fiap.carton.repository

import com.fiap.carton.model.AccountModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository: JpaRepository<AccountModel, Long> {
}