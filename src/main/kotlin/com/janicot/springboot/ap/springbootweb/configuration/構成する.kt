package com.janicot.springboot.ap.springbootweb.configuration

import com.janicot.springboot.ap.springbootweb.domain.adapter.使用者のアダプター
import com.janicot.springboot.ap.springbootweb.domain.model.使用者
import com.janicot.springboot.ap.springbootweb.domain.ports.api.使用者のエーピーアイインターフェース
import com.janicot.springboot.ap.springbootweb.domain.ports.spi.使用者のスピーアイインターフェース
import com.janicot.springboot.ap.springbootweb.domain.service.使用者のサービス
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class 構成する {

    @Bean
    fun 構成する使用者のエーピーアイインターフェース():使用者のエーピーアイインターフェース<使用者> = 使用者のサービス()

    @Bean
    fun 構成する使用者のアダプター():使用者のスピーアイインターフェース<使用者> = 使用者のアダプター(構成する使用者のエーピーアイインターフェース())
}