package com.fiap.carton.business

import com.fiap.carton.model.ClientModel
import com.fiap.carton.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired

class ClientBusinesss: IClientBusinesss {

    @Autowired
    private lateinit var repository: ClientRepository

    override fun Create(obj: ClientModel): ClientModel{
        return repository.save(obj)
    }

    override fun Alter(obj: ClientModel): Boolean{
        return try {
            this.repository.save(obj)
            true
        }
        catch (ex: Exception){
            false
        }
    }

    override fun Delete(obj: ClientModel): Boolean{
        return try {
            this.repository.delete(obj)
            true
        }
        catch (ex: Exception){
            false
        }
    }
}

