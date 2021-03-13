package com.example.Consumer.service;

import com.example.Consumer.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
    Task update(Integer id, Task task);
    void delete(Integer id);
    Task create(Task task);
    Task findById(Integer id);
}
