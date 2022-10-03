package com.fiap.carton.business

import com.fiap.carton.model.AccountModel

interface IAccountBusiness{
    fun Create(obj: AccountModel): AccountModel?
    fun Delete(obj: AccountModel): Boolean
}