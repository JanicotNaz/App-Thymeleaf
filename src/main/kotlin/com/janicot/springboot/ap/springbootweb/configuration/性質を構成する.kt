package com.janicot.springboot.ap.springbootweb.configuration

import com.janicot.springboot.ap.springbootweb.util.刷る
import org.springframework.beans.factory.config.PropertiesFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.core.io.ClassPathResource
import java.io.*
import java.nio.charset.Charset
import java.util.*


@Configuration
@PropertySource(value = ["classpath:application-string.properties"] /*encoding = "UTF-8"*/)
class 性質を構成する {

//    @Bean
//    fun propertiesfilemapping(): PropertiesFactoryBean? {
//        val factoryBean = PropertiesFactoryBean()
//        factoryBean.setFileEncoding("UTF-8")
//        factoryBean.setLocation(ClassPathResource("application-string.properties"))
//        return factoryBean
//    }
}