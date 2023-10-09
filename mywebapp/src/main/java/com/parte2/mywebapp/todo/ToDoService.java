package com.parte2.mywebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ToDoService {
    private static List<ToDo> todos = new ArrayList<ToDo>();
    private static int todosCount = 0;

    static {
        todos.add(new ToDo(
                ++todosCount,
                "Alura",
                "Docker",
                LocalDate.now(),
                true));
        todos.add(new ToDo(
                ++todosCount,
                "Alura",
                "Swarm",
                LocalDate.now(),
                true));

    }

    public List<ToDo> findByUserName(String username) {
        return todos;
    }

    public void addTodos(
            String username,
            String description,
            LocalDate localDate,
            boolean done) {
        var todo = new ToDo(++todosCount, username, description, localDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super ToDo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

}
