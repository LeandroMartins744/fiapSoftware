package com.fiap.carton.business

import com.fiap.carton.model.CartonModel
import com.fiap.carton.model.ClientModel
import com.fiap.carton.repository.CartonChangeRepository
import com.fiap.carton.repository.CartonRepository

class CartonChangeBusiness {
    fun Debit(obj: ICartonChangeBusiness, client: ClientModel, value: Double){
        obj.Debit(client, value)
    }

    fun Crebit(obj: ICartonChangeBusiness, client: ClientModel, value: Double){
        obj.Credit(client, value)
    }
}