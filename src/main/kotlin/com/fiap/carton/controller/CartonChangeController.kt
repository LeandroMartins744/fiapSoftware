package com.fiap.carton.controller

import com.fiap.carton.business.*
import com.fiap.carton.model.CartonModel
import com.fiap.carton.model.ClientModel
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class CartonChangeController {

    private lateinit var business: CartonChangeBusiness
    private lateinit var businessMaster: CartonChangeMasterBusiness
    private lateinit var businessVisa: CartonChangeVisaBusiness

    @PostMapping("api/change/debito/master")
    @ResponseBody
    fun DebitoMaster(@RequestParam(required = true) obj: ClientModel, value: Double){
        return business.Debit(businessMaster, obj, value);
    }

    @PostMapping("api/change/credito/master")
    @ResponseBody
    fun CreditoMaster(@RequestParam(required = true) obj: ClientModel, value: Double){
        return business.Crebit(businessMaster, obj, value);
    }

    @PostMapping("api/change/debito/visa")
    @ResponseBody
    fun DebitoVisa(@RequestParam(required = true) obj: ClientModel, value: Double){
        return business.Debit(businessVisa, obj, value);
    }

    @PostMapping("api/change/credito/visa")
    @ResponseBody
    fun CreditoVisa(@RequestParam(required = true) obj: ClientModel, value: Double){
        return business.Crebit(businessVisa, obj, value);
    }

}