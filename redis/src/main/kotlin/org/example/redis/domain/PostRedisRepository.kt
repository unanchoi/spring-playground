package org.example.redis.domain

import org.springframework.data.repository.CrudRepository

interface PostRedisRepository: CrudRepository<Post, Long> {
}