package com.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Models.Result;

@Repository
public interface ResultDAO extends JpaRepository<Result, Integer> {

}
