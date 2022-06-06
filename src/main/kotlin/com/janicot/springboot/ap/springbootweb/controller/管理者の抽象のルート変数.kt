package com.janicot.springboot.ap.springbootweb.controller

import com.janicot.springboot.ap.springbootweb.util.刷る
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.env.Environment
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping


@RequestMapping("/api/v1/variable")
abstract class 管理者の抽象のルート変数 {


    @Value("\${titulo}")
    private lateinit var 文章の変数:String

//    @Value("#{propertiesfilemapping['titulo']}")
//    private lateinit var texto:String

    /*
    Nota para que no se te olvide, al parecer con las pruebas hechas un caracter unico que paso en properties desde antes
    no se va poder mostrar bien ya que paso por ISO-8859-1 lo que generara basura y errores en la cadena de Bytes, aunque
    lo transformes a UTF-8 el valor ya esta perdido desde que se paso en el ISO-8859-1, posible solución es que se cambie
    desde properties la codificación a UTF-8 lA pruebas estaran comentadas
    刷る.印刷("título")
    val decodedToUTF8 = String(texto.toByteArray(charset("ISO-8859-1")), charset("UTF-8"))
    val decodedToUTF82 = String(text.toByteArray(charset("ISO-8859-1")), charset("UTF-8"))
    刷る.印刷("${text} ${texto} ${decodedToUTF8} ${decodedToUTF82}")
    se tuvo que utilizar el Unicode Han Character para resolver este proplema
    https://www.unicode.org/cgi-bin/GetUnihanData.pl?codepoint=%E5%87%BA
    https://en.wikipedia.org/wiki/Hiragana_(Unicode_block)
     */


    @GetMapping
    fun 見出し(型:Model):String{
        型.addAttribute("title", "${文章の変数}")
        return "variable/見出し"
    }

    @GetMapping("/string/{text}")
    fun 変数(@PathVariable(name = "text") 文章:String, 型:Model):String{
        型.addAttribute("title", "${文章の変数}")
        型.addAttribute("result", "ルートの文章は${文章}です")
        return "variable/見る"
    }

    @GetMapping("/string/{text}/{number}")
    fun 変数(@PathVariable(name = "text") 文章:String,
    @PathVariable(name = "number") 号:String, 型: Model):String{
        型.addAttribute("title", "${文章の変数}")
        型.addAttribute("result", "ルートの文章は${文章}です。ルートの号は${号}です")
        return "variable/見る"
    }
}