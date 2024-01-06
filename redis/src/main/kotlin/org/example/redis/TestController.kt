package org.example.redis

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController {

    @GetMapping
    fun test(): TestResponse {
        return TestResponse("ok")
    }

    data class TestResponse(
        val status: String
    )
}