package com.fiap.carton.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class AccountModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val bank: Int,
    val numberAccount: Int,
    val schedule: Int,
    val typeAccount: String)
