package com.example.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Models.Calorie_info;

@Repository
public interface Calorie_infoDAO extends JpaRepository<Calorie_info, Integer> {

}
