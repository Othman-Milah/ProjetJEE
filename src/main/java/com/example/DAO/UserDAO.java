package com.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Models.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

}
