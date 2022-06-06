package com.janicot.springboot.ap.springbootweb.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.config.PropertiesFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.core.io.ClassPathResource
import org.thymeleaf.spring5.view.ThymeleafViewResolver


@Configuration
class 言語を構成する {

//    @Value("\${titulo}")
//    private lateinit var text:String

    @Bean
    fun 言語():ThymeleafViewResolver{
        var 解決 = ThymeleafViewResolver()
        解決.characterEncoding = "UTF-8"
        return 解決
    }


}