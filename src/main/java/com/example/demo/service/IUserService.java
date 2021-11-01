package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;




public interface IUserService { 
	 
	List<User> retrieveAllUsers(); 
	User addUser(User u);
	void deleteUser(String id);
	User updateUser(User u);
	User retrieveUser(String id);

} 
 