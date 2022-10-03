package com.fiap.carton.business

import com.fiap.carton.model.AccountModel
import com.fiap.carton.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountBusiness:IAccountBusiness {
    @Autowired
    private lateinit var repository: AccountRepository

    override fun Create(obj: AccountModel): AccountModel?{
        return try{
            this.repository.save(obj)
        }
        catch (ex: Exception){
            null
        }
    }

    override fun Delete(obj: AccountModel): Boolean{
        return try {
            this.repository.delete(obj)
            true
        }
        catch (ex: Exception){
            false
        }
    }
}

