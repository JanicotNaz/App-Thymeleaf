package com.janicot.springboot.ap.springbootweb.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api/v1")
abstract class 管理者の抽象のホーム {

    @GetMapping("/")
    fun ホーム():String{
        return "forward:/api/v1/home"
//        return "redirect:https://www.youtube.com/"
    }
}