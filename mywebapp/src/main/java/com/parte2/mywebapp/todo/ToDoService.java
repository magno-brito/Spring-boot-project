package com.parte2.mywebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private static List<ToDo> todos = new ArrayList<ToDo>();

    static {
        todos.add(new ToDo(
                1,
                "Alura",
                "Docker",
                LocalDate.now(),
                true));
        todos.add(new ToDo(
                2,
                "Alura",
                "Swarm",
                LocalDate.now(),
                true));

    }

    public List<ToDo> findByUserName(String username) {
        return todos;
    }

}
