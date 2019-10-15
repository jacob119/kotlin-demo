package com.example.kotlindemo

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDemoApplication : CommandLineRunner {

    private val log = LoggerFactory.getLogger(KotlinDemoApplication::class.java)

    @Value("\${fileName}")
    lateinit var fileName: String


    override fun run(vararg args: String?) {
        log.info("Hello Kotlin $fileName")
    }

//	@Bean
//	fun init() = ApplicationRunner {
//		log.info("Hello Kotlin $fileName")
//	}
}

fun main(args: Array<String>) {
    runApplication<KotlinDemoApplication>(*args)
}
