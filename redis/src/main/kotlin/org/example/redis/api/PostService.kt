package org.example.redis.api

import org.example.redis.domain.Post
import org.example.redis.domain.PostRedisRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRedisRepository: PostRedisRepository
) {

    fun createPost(request: PostCreateRequest): PostResponse{
        val post = Post(
            title = request.title,
            content = request.content
        )
        return PostResponse.of(postRedisRepository.save(post))
    }

    fun getPost(id: Long): PostResponse {
        val post = postRedisRepository.findById(id)
            .orElseThrow { throw RuntimeException("Post not found") }
        return PostResponse.of(post)
    }

    data class PostResponse(
        val id: Long,
        val title: String,
        val content: String
    ) {
        companion object {
            fun of(post: Post): PostResponse {
                return PostResponse(
                    id = post.id!!,
                    title = post.title,
                    content = post.content
                )
            }
        }
    }

    data class PostCreateRequest(
        val title: String,
        val content: String
    ) {
    }

}
