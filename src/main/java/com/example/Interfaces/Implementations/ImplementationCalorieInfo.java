package com.example.Interfaces.Implementations;

import com.example.DAO.Calorie_infoDAO;
import com.example.Interfaces.Icalorie_info;
import com.example.Models.Calorie_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementationCalorieInfo implements Icalorie_info {

	@Autowired
	Calorie_infoDAO repo;
	
	
	@Override
	public Calorie_info addInfo(Calorie_info i) {
		// TODO Auto-generated method stub
		repo.save(i);
		return i;
	}

	@Override
	public boolean deleteInfo(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return true;
	}

}
