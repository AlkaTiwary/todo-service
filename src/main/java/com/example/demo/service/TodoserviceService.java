package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Todoservice;

public interface TodoserviceService {
	void createTodoservice(Todoservice todoservice);
	List<Todoservice> getAllTodoservice();
	Todoservice findById(Integer id);
	void delete(Integer id);
}
