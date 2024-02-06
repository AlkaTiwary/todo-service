package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todoservice;
import com.example.demo.repo.TodoRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoserviceServiceImpl implements TodoserviceService {
	private  TodoRepo todorepo;
	@Override
	public void createTodoservice(Todoservice todoservice) {
		// TODO Auto-generated method stub
		todorepo.save(todoservice);
	}

	@Override
	public List<Todoservice> getAllTodoservice() {
		// TODO Auto-generated method stub

		return todorepo.findAll();
	}

	@Override
	public Todoservice findById(Integer id) {
		// TODO Auto-generated method stub
		return todorepo.findById(id).get();
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	}
}
