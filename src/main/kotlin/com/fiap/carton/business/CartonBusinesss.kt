package com.fiap.carton.business

import com.fiap.carton.model.CartonModel
import com.fiap.carton.repository.CartonRepository
import org.springframework.beans.factory.annotation.Autowired

class CartonBusinesss: ICartonBusinesss {

    @Autowired
    private lateinit var repository: CartonRepository

    override fun Create(obj: CartonModel): CartonModel? {
        return try{
            this.repository.save(obj)
        }
        catch (ex: Exception)
        {
            null
        }
    }

    override fun Limit(id: Long): Double {
        return try {
            repository.getById(id).limit
        }
        catch (ex: Exception){
            0.0
        }
    }

    override fun UpdateLimit(obj: CartonModel): Boolean {
        return try {
            repository.save(obj)
            true
        }
        catch (ex:Exception){
            false
        }
    }
}