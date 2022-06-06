package com.janicot.springboot.ap.springbootweb.domain.model

data class 使用者(var 名前: String? = null, var 名字: String? = null,var メール:String? = null){
    fun 名前を受ける(名前: String?): 使用者 {
        this.名前 = 名前
        return this
    }
    fun 名字を受ける(名字: String?): 使用者 {
        this.名字 = 名字
        return this
    }
    fun メールを受ける(メール: String): 使用者{
        this.メール = メール
        return this
    }
}
