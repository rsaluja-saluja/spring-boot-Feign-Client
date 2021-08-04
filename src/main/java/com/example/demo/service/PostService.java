package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Post;

public interface PostService {
	List<Post> getAllPosts();
	Post getPostById(Long postId);
	List<Post> getAllPostsByUserId(Long userId);
	Post createPost(Post post);
	void updatePost(Long postId, Post post);
	void deletePost(Long postId);
}
