package com.example.Interfaces;

import org.springframework.stereotype.Service;

import com.example.Models.User;

@Service
public interface IUsers {
	
	boolean checkUserAccount(User u);
	User addUser(User u);
	boolean removeUser(Integer id);
}
