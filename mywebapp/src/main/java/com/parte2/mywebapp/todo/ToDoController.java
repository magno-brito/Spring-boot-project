package com.parte2.mywebapp.todo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@SessionAttributes("name")
public class ToDoController {

    private ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        var todos = toDoService.findByUserName("Alura");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showListToDo(ModelMap model) {
        return "todo";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    public String addListToDo(@RequestParam String description, ModelMap model) {
       String username =  (String)model.get("name");
        toDoService.addTodos(
                username,
                description,
                LocalDate.now(),
                false);
        return "redirect:list-todos";
    }
}
