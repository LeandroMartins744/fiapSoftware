package com.fiap.carton.repository

import com.fiap.carton.model.ClientModel
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<ClientModel, Long> {
}