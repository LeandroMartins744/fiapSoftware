package com.fiap.carton.controller

import com.fiap.carton.business.AccountBusiness
import com.fiap.carton.model.AccountModel
import com.fiap.carton.model.ClientModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class AccountController {

    @Autowired
    private lateinit var business: AccountBusiness

    @PostMapping("api/account")
    @ResponseBody
    fun Post(@RequestParam(required = true) obj: AccountModel): AccountModel? {
        return business.Create(obj);
    }

    @DeleteMapping("api/account")
    @ResponseBody
    fun Delete(@RequestParam(required = true) client: AccountModel): Boolean{
        return business.Delete(client);
    }
}