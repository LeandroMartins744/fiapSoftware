package com.fiap.carton.model

import com.fiap.carton.model.CartonModel

class ChargeModel (
    val id: Int,
    val carton: CartonModel,
    val value: Double,
    val type: String) {
}