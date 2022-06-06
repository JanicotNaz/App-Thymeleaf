package com.janicot.springboot.ap.springbootweb.controller

import com.fasterxml.jackson.annotation.JsonProperty
import com.janicot.springboot.ap.springbootweb.domain.model.使用者
import com.janicot.springboot.ap.springbootweb.domain.ports.spi.使用者のスピーアイインターフェース
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api/v1/index","/api/v1/home")
abstract class 管理者の抽象の見出し {

    @Autowired
    private lateinit var 使用者のスピーアイインターフェースの変数: 使用者のスピーアイインターフェース<使用者>

    @GetMapping
    fun 見出し(形: Model):String {
        形.addAttribute("titles", "見出し")
        形.addAttribute("text", "こにちは")
        return  "見出し"
    }

    @GetMapping("/perfil")
    fun 横顔(地図: MutableMap<String,Any?>): String{
        var 使用者の変数 = 使用者のスピーアイインターフェースの変数.使用者を取るんです()
        地図["user_name"] = 使用者の変数.名前
        地図["user_lastname"] = 使用者の変数.名字
        地図["user_email"] = 使用者の変数.メール
        地図["titles"] = "使用者の横顔は: ".plus(使用者の変数.名前)
        return "横顔"
    }

//    @GetMapping("/list", produces = ["application/json"])
//    fun hola():使用者{
//        var 使用者の変数 = 使用者のスピーアイインターフェースの変数.使用者を取るんです()
//        return 使用者の変数
//    }

    @GetMapping("/lista")
    fun 配列(形: Model):String{
        形.addAttribute("titles", "見出し")
        var 使用者の配列 = 使用者のスピーアイインターフェースの変数.使用者の配列を取るんです()
        var 名前の配列: MutableList<String> = ArrayList()
        var 名字の配列: MutableList<String> = ArrayList()
        var メールの配列: MutableList<String> = ArrayList()
        使用者の配列.forEach {
            名前の配列.add(it.名前 ?: "")
            名字の配列.add(it.名字 ?: "")
            メールの配列.add(it.メール ?: "")
        }
        形.addAttribute("users", 使用者の配列)
        形.addAttribute("users_name", 名前の配列)
        形.addAttribute("users_lastname", 名字の配列)
        形.addAttribute("users_email", メールの配列)
        return "配列"
    }

}