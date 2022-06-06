package com.janicot.springboot.ap.springbootweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootWebApplication

fun main(args: Array<String>) {
	runApplication<SpringBootWebApplication>(*args)
}
