package com.example.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				j++;
			}
		}
	}

}
