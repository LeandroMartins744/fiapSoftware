package com.fiap.carton.business

import com.fiap.carton.model.CartonModel

interface ICartonBusinesss {
    fun Create(obj: CartonModel): CartonModel?
    fun Limit(id: Long): Double
    fun UpdateLimit(obj: CartonModel): Boolean
}