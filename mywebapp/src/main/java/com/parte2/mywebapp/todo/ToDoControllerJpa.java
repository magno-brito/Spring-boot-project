package com.parte2.mywebapp.todo;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

//@Controller
@SessionAttributes("name")
@Controller
public class ToDoControllerJpa {


    public ToDoControllerJpa(ToDoService toDoService, TodoRepository todoRepository) {
        super();
        this.toDoService = toDoService;
        this.todoRepository = todoRepository;
    }

    private ToDoService toDoService;

    private TodoRepository todoRepository;




    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        String username = (String) model.get("name");
        var todos = todoRepository.findByUsername(username);
        model.addAttribute("todos", todos);
        System.out.println(todos);
        return "listTodos";
    }

    private String getLoggedInUsername(ModelMap model) {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showListToDo(ModelMap model) {
        String username = (String) model.get("name");
        ToDo todo = new ToDo(0, username, "", LocalDate.now(), false);
        model.put("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addListToDo(ModelMap model, @Valid ToDo todo, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("todo", todo);
            return "todo";
        }
        String username = (String) model.get("name");
        todo.setUsername(username);
        todoRepository.save(todo);

//        toDoService.addTodos(
//                username,
//                todo.getDescription(),
//                todo.getTargetDate(),
//                todo.isDone());

        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteToDo(@RequestParam int id) {
        todoRepository.deleteById(id);
        return "redirect:list-todos";

    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpDateToDo(@RequestParam int id, ModelMap model) {
        ToDo todo = todoRepository.findById(id).get();
        model.addAttribute("todo", todo);
        return "todo";

    }

    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateToDo(ModelMap model, @Valid ToDo todo, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("todo", todo);
            return "todo";
        }
        String username = (String) model.get("name");
        todo.setUsername(username);
        todoRepository.save(todo);
//        toDoService.updateTodos(todo);
        return "redirect:list-todos";
    }

}
