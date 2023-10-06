package com.parte2.mywebapp.todo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class ToDo {
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public ToDo(int id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }


}
