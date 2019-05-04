package com.bigbook.cloud.user.openapi.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private Long id;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")  
	private Date createdAt;

	public User() {
		super();
	}

	public User(Long id, String name, Date createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", createdAt=" + createdAt + "]";
	}

}
