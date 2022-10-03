package com.fiap.carton.business

import com.fiap.carton.model.ClientModel

interface IClientBusinesss{
    fun Create(obj: ClientModel): ClientModel
    fun Alter(obj: ClientModel): Boolean
    fun Delete(obj: ClientModel): Boolean
}