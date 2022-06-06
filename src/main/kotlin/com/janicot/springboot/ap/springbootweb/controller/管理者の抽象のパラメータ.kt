package com.janicot.springboot.ap.springbootweb.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.servlet.http.HttpServletRequest

@RequestMapping("/api/v1/param")
abstract class 管理者の抽象のパラメータ {



    @GetMapping("/index")
    fun 見出し():String{
        return "param/見出し"
    }

    @GetMapping("/string")
    fun パラメータ(@RequestParam(name = "text", required = false, defaultValue = "何も") 文章:String, 型: Model):String{
        型.addAttribute("result", "文章は${文章}を送るんです")
        return "param/見る"
    }

    @GetMapping("/mix-params")
    fun パラメータ(@RequestParam(name = "greeting", required = false, defaultValue = "何も") 挨拶:String,
    @RequestParam(name = "number", required = false, defaultValue = "何も") 号:String, 型: Model):String{
        型.addAttribute("result", "挨拶は${挨拶}です。号は${号}です")
        return "param/見る"
    }

    @GetMapping("mix-params-request")
    fun パラメータ(答え:HttpServletRequest, 型: Model):String{
        var 挨拶:String = 答え.getParameter("greeting")
        var 号:String = 答え.getParameter("number")
        型.addAttribute("result", "挨拶は${挨拶}です。号は${号}です")
        return "param/見る"
    }
}