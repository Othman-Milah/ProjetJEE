package com.example.Interfaces;

import org.springframework.stereotype.Service;

import com.example.Models.Calorie_info;

@Service
public interface Icalorie_info {

	Calorie_info addInfo(Calorie_info i);
	boolean deleteInfo(Integer id);
	
}
