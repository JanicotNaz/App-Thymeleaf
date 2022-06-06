package com.janicot.springboot.ap.springbootweb.domain.adapter

import com.janicot.springboot.ap.springbootweb.domain.model.使用者
import com.janicot.springboot.ap.springbootweb.domain.ports.api.使用者のエーピーアイインターフェース
import com.janicot.springboot.ap.springbootweb.domain.ports.spi.使用者のスピーアイインターフェース

abstract class 抽象の使用者のアダプター: 使用者のスピーアイインターフェース<使用者> {
    private var 使用者のエーピーアイインターフェースの変数: 使用者のエーピーアイインターフェース<使用者>

    constructor(使用者のエーピーアイインターフェースの変数: 使用者のエーピーアイインターフェース<使用者>){
        this.使用者のエーピーアイインターフェースの変数 = 使用者のエーピーアイインターフェースの変数
    }

    override fun 使用者を取るんです(): 使用者 {
        return 使用者のエーピーアイインターフェースの変数.使用者を取るんです()
    }

    override fun 使用者の配列を取るんです(): List<使用者> {
        return 使用者のエーピーアイインターフェースの変数.使用者の配列を取るんです()
    }
}