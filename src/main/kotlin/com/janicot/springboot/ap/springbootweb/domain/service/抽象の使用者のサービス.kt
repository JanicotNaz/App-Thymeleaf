package com.janicot.springboot.ap.springbootweb.domain.service

import com.janicot.springboot.ap.springbootweb.domain.model.使用者
import com.janicot.springboot.ap.springbootweb.domain.ports.api.使用者のエーピーアイインターフェース

abstract class 抽象の使用者のサービス: 使用者のエーピーアイインターフェース<使用者> {
    override fun 使用者を取るんです(): 使用者 {
        val 使用者の変数:使用者 = 使用者().名前を受ける("Janicot").名字を受ける("Nazaret").メールを受ける("janicot@nazaret.com")
        return 使用者の変数
    }

    override fun 使用者の配列を取るんです(): List<使用者> {
        val 使用者の配列:MutableList<使用者> = ArrayList()
        使用者の配列.add(使用者("Luis","Lopez","luis@lopez.com"))
        使用者の配列.add(使用者("antonio","espinosa","antonio@espinosa.com"))
        使用者の配列.add(使用者("janicot","Nazaret", "janicot@nazaret.com"))
        return 使用者の配列
    }
}