package com.fiap.carton.controller

import com.fiap.carton.business.CartonBusinesss
import com.fiap.carton.business.ClientBusinesss
import com.fiap.carton.model.CartonModel
import com.fiap.carton.model.ClientModel
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class CartonController {

    private lateinit var business: CartonBusinesss

    @PostMapping("api/carton")
    @ResponseBody
    fun Post(@RequestParam(required = true) obj: CartonModel): CartonModel?{
        return business.Create(obj);
    }

    @PostMapping("api/carton/limit")
    @ResponseBody
    fun Limit(@RequestParam(required = true) obj: Long): Double{
        return business.Limit(obj);
    }

    @PutMapping("api/carton")
    @ResponseBody
    fun Delete(@RequestParam(required = true) obj: CartonModel): Boolean{
        return business.UpdateLimit(obj);
    }
}