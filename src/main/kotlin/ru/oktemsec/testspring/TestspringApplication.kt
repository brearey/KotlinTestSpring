package ru.oktemsec.testspring

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TestspringApplication

fun main(args: Array<String>) {
    runApplication<TestspringApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
