package com.example.demo.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Post;

@FeignClient(name = "postFeignClient", url = "${client.post.baseUrl}")
public interface PostFeignClient {

	@GetMapping("/posts")
    List<Post> getAllPosts();

    @GetMapping("/posts/{postId}")
    Post getPostById(@PathVariable Long postId);

    @GetMapping("/posts")
    List<Post> getPostByUserId(@RequestParam Long userId);

    @PostMapping("/posts")
    Post createPost(Post post);

    @PutMapping("/posts")
    Post updatePost(Post post);

    @DeleteMapping("/posts/{postId}")
    Post deletePost(@PathVariable Long postId);
}
