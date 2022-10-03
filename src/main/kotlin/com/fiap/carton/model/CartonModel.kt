package com.fiap.carton.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class CartonModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val client: ClientModel,
    var flag: String,
    val nameCarton: String,
    val numberCarton: Int,
    var dateCarton: String,
    val codeCarton: Int,
    var limit: Double)

