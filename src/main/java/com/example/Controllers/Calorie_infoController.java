package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interfaces.Implementations.ImplementationCalorieInfo;
import com.example.Models.Calorie_info;

@RequestMapping("/calorie")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Calorie_infoController {

	@Autowired
	ImplementationCalorieInfo repo;
	
	@PostMapping("/add")
	public Calorie_info add_info(@RequestBody Calorie_info i) {
		repo.addInfo(i);
		return i;
	}
	
	@DeleteMapping("/delete")
	public boolean deleteInfo(@PathVariable Integer id) {
		repo.deleteInfo(id);
		return true;
	}
	
}
