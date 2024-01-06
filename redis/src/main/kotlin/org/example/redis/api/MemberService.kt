package org.example.redis.api

import org.example.redis.domain.Member
import org.example.redis.domain.MemberRepository
import org.slf4j.LoggerFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service
import java.util.concurrent.TimeUnit


@Service
class MemberService(
    private val memberRepository: MemberRepository,
    private val redisTemplate: RedisTemplate<String, String>,
) {
    private val log = LoggerFactory.getLogger(javaClass)

    fun createMember(name: String): Boolean {
        val member: Member = memberRepository.save(Member(name = name))

        redisTemplate.opsForValue().set(member.id.toString(), name)
        redisTemplate.expire(member.id.toString(), 10, TimeUnit.SECONDS)
        log.info("Redis Save Complete: $member")
        return true
    }

    fun getMemberBy(memberId: Long): MemberResponse {
        val name = redisTemplate.opsForValue().get(memberId.toString())
            ?: getMemberFromRepository(memberId)
        return MemberResponse(memberId, name)
    }

    private fun getMemberFromRepository(memberId: Long): String {
        log.info("Redis Cache Miss")
        return memberRepository.findById(memberId)
            .orElseThrow { throw RuntimeException("Member not found") }
            .name

    }

    data class MemberResponse(
        val id: Long,
        val name: String,
    ) {

    }

}