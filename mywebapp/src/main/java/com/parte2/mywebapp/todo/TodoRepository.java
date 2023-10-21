package com.parte2.mywebapp.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repositories let us take actions on entities
@Repository
public interface TodoRepository extends JpaRepository<ToDo,Integer> {

    public List<ToDo> findByUsername(String username);
}
