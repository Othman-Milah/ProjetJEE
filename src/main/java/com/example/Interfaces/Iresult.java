package com.example.Interfaces;

import org.springframework.stereotype.Service;

import com.example.Models.Result;

@Service
public interface Iresult {

	Result addResult(Result r);
	boolean deleteResult (Integer i);
}
