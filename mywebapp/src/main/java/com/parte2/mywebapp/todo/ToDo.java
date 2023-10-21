package com.parte2.mywebapp.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity()
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    @Size(min = 1, message = "Enter at least 1 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;


}
