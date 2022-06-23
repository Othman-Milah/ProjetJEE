package com.example.Interfaces.Implementations;

import com.example.DAO.ResultDAO;
import com.example.Interfaces.Iresult;
import com.example.Models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementationResult implements Iresult {
	
	@Autowired
	ResultDAO repo;
	
	@Override
	public Result addResult(Result r) {
		// TODO Auto-generated method stub
		repo.save(r);
		return r;
	}

	@Override
	public boolean deleteResult(Integer i) {
		// TODO Auto-generated method stub
		repo.deleteById(i);
		return true;
	}

}
