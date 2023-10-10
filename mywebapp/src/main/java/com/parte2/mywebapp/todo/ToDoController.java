package com.parte2.mywebapp.todo;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
        toDoService.addTodos(
                username,
                todo.getDescription(),
                todo.getTargetDate(),
                false);
        return "redirect:list-todos";
    }

    @RequestMapping("delete-todo")
    public String deleteToDo(@RequestParam int id) {
        toDoService.deleteById(id);
        return "redirect:list-todos";

    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpDateToDo(@RequestParam int id, ModelMap model) {
        ToDo todo = toDoService.findById(id);
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
        toDoService.updateTodos(todo);
        return "redirect:list-todos";
    }

}
