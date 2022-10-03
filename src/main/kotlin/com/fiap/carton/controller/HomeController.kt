package com.fiap.carton.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("hello")
    fun Hello(): String{
        return "sakj, djksd jksdhteste";
    }
}