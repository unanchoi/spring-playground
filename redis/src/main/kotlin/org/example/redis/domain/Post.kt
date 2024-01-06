package org.example.redis.domain

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash


@RedisHash(value = "post", timeToLive = 60 * 60 * 24)
class Post(
    @Id
    var id: Long? = null,
    val title: String = "",
    val content: String = "",
) {

}