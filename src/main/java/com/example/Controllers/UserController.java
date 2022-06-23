package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interfaces.Implementations.ImplementUsersInterface;
import com.example.Models.User;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController  {
	
	@Autowired
	ImplementUsersInterface repo;
	
	@PostMapping("/validate")
	public boolean ValidateUser(@RequestBody User u) {
		System.out.println("This is the insert " + u.getName());
		return repo.checkUserAccount(u);
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User u ) {
		System.out.println("This is the insert " + u.getName());
		return repo.addUser(u);
	}
	
	@DeleteMapping("/del")
	public boolean deleteUser(@PathVariable Integer id) {
		return repo.removeUser(id);
	}

}
