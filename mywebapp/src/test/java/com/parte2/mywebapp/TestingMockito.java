package com.parte2.mywebapp;

import com.parte2.mywebapp.todo.ToDo;
import com.parte2.mywebapp.todo.ToDoControllerJpa;
import com.parte2.mywebapp.todo.ToDoService;
import com.parte2.mywebapp.todo.TodoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.AssertionErrors;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestingMockito {

    @Mock
    private ToDo todo;

    @Mock
    private TodoRepository repository;

    @InjectMocks
    private ToDoControllerJpa todoControllerJpa;


    @Test
    void testRepository() {
        System.out.println(repository.findById(1));
        repository.deleteById(1);

    }

}
