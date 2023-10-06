package com.parte2.mywebapp.todo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

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
}
