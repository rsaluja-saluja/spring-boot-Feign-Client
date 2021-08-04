package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FeignClient.PostFeignClient;
import com.example.demo.model.Post;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
    private PostFeignClient postFeignClient;
	
	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return postFeignClient.getAllPosts();
	}

	@Override
	public Post getPostById(Long postId) {
		// TODO Auto-generated method stub
		return postFeignClient.getPostById(postId);
	}

	@Override
	public List<Post> getAllPostsByUserId(Long userId) {
		// TODO Auto-generated method stub
		return postFeignClient.getPostByUserId(userId);
	}

	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return postFeignClient.createPost(post);
	}

	@Override
	public void updatePost(Long postId, Post post) {
		// TODO Auto-generated method stub
		postFeignClient.updatePost(post);
	}

	@Override
	public void deletePost(Long postId) {
		// TODO Auto-generated method stub
		postFeignClient.deletePost(postId);
	}

}
