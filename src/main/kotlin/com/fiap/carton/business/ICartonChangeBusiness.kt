package com.fiap.carton.business

import com.fiap.carton.model.ClientModel

interface ICartonChangeBusiness {
    fun Debit(client: ClientModel, value: Double): Boolean
    fun Credit(client: ClientModel, value: Double): Boolean
}