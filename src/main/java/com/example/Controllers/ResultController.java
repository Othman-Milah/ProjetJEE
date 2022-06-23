package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interfaces.Implementations.ImplementationResult;
import com.example.Models.Result;

@RequestMapping("/result")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ResultController {

	@Autowired
	ImplementationResult repo;
	
	@PostMapping("/add")
	public Result addResult(@RequestBody Result r) {
		repo.addResult(r);
		return r;
	}
	
	@DeleteMapping("/delete")
	public boolean deleteResult(@PathVariable Integer id) {
		repo.deleteResult(id);
		return true;
	}
	
	
}
