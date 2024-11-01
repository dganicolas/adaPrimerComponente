package com.es.primerComponente.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class holaMundoController() {

    @GetMapping("/holaMundo")
    fun getHolaMundo(): String{
        return "hola mundo"
    }
}