package com.fiap.carton.repository

import com.fiap.carton.model.CartonModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface CartonRepository : JpaRepository<CartonModel, Long> {
    @Query("FROM CartonModel m WHERE m.client = :title and m.flag = :flag")
    fun Carton(@Param("client") client: Int, @Param("flag") flag: String): List<CartonModel?>?
}