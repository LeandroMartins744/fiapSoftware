package com.fiap.carton.controller

import com.fiap.carton.business.ClientBusinesss
import com.fiap.carton.model.ClientModel
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class ClientController {

    private lateinit var business: ClientBusinesss

    @PostMapping("api/client")
    @ResponseBody
    fun Post(@RequestParam(required = true) client: ClientModel): ClientModel{
        return business.Create(client);
    }

    @PutMapping("api/client")
    @ResponseBody
    fun Put(@RequestParam(required = true) client: ClientModel): Boolean{
        return business.Alter(client);
    }

    @DeleteMapping("api/client")
    @ResponseBody
    fun Delete(@RequestParam(required = true) client: ClientModel): Boolean{
        return business.Delete(client);
    }
}