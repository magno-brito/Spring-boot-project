package com.parte2.mywebapp;

import com.parte2.mywebapp.todo.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MywebappApplicationTests {

	private TodoRepository todoRepository;
	@Test
	void contextLoads() {
		int soma = 10;
		assertEquals(soma, 10);

	}

}
