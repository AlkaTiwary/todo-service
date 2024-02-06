package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todoservice;
import com.example.demo.service.TodoserviceService;

import lombok.AllArgsConstructor;

	@RestController
	@RequestMapping("/todo")
	@AllArgsConstructor
	public class todoController {
		private TodoserviceService todoService;
		@GetMapping
		public List<Todoservice> getAllTodo(){
			return todoService.getAllTodoservice();
		}
		@PostMapping("/save")
		public void createTodo(@RequestBody Todoservice todo) {
			todoService.createTodoservice(todo);
		}
		@DeleteMapping("/delete")
		public void delete(@RequestParam("id") Integer id) {
			todoService.delete(id);
		}
		
	}
