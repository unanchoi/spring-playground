package org.example.redis.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class PostController(
    private val postService: PostService
) {

    @PostMapping("/api/post")
    fun createPost(@RequestBody request: PostService.PostCreateRequest): PostService.PostResponse {
        val response =  postService.createPost(request)
        return response
    }

    @GetMapping("/api/post/{id}")
    fun getPost(@PathVariable id: Long): PostService.PostResponse {
        return postService.getPost(id)
    }
}