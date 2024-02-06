package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name="todo_service")
@Data
public class Todoservice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="todo_ID")
	private int todoId;
	@JsonProperty
	@Column(name="is_Completed")
	private boolean isCompleted;
	@Column(name="complete_Date")
	private String completionDate;
	@Column(name="todo_Name")
	private todoName name;
}
