package com.example.demo.model;

public class Post {

	String id;
	String userId;
	String title;
	boolean completed;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(String id, String userId, String title, boolean completed) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.completed = completed;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	
}
