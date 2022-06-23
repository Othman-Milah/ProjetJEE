package com.example.Interfaces.Implementations;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.DAO.UserDAO;
import com.example.Interfaces.IUsers;
import com.example.Models.User;

@Service
public class ImplementUsersInterface implements IUsers {
	
	@Autowired
	UserDAO repo;

	@Override
	public boolean checkUserAccount(User u) {
		// TODO Auto-generated method stub
		List<User> lu = new ArrayList();
		
		lu = repo.findAll();
		
		for(User user : lu){
			//System.out.println("Comparing "+user.getEmail()+" to "+u.getEmail());
			//System.out.println("Comparing "+user.getPassword()+" to "+u.getPassword());
			if(user.getEmail().equals(u.getEmail()) && user.getPassword().equals(u.getPassword())) 
				return true;		
		}
		return false;	
	}

	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		repo.save(u);
		return u;
	}

	@Override
	public boolean removeUser(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return true;
	}

	
	
}
