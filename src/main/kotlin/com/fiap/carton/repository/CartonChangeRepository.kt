package com.fiap.carton.repository

import com.fiap.carton.model.ChargeModel
import org.springframework.data.jpa.repository.JpaRepository

interface CartonChangeRepository: JpaRepository<ChargeModel, Long>{}