package org.example.redis.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class MemberApiController(
    private val memberService: MemberService
) {

    @GetMapping("/api/member/{id}")
    fun getMember(@PathVariable id: Long) : MemberService.MemberResponse {
        val response = memberService.getMemberBy(id)
        return response
    }

    @PostMapping("/api/member")
    fun createMember(@RequestBody request: MemberCreateRequest) {
        memberService.createMember(request.name)
    }

    data class MemberCreateRequest(val name: String) {

    }
}