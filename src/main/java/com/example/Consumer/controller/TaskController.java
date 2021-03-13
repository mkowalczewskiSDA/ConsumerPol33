package com.example.Consumer.controller;

import com.example.Consumer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public String findAll() {
        var tasks = taskService.findAll();
        return "tasks";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Integer id) {
        taskService.delete(id);
        System.out.println("test");
        return "redirect:/";
    }

}
