package com.example.Consumer.service;

import com.example.Consumer.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TaskServiceImpl implements TaskService {

    @Value("${resource.tasks}")
    private String resource;
    @Value("${resource.tasks}/{id}")
    private String idResource;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Task> findAll() {
        return Arrays.asList(Objects.requireNonNull(restTemplate.getForObject(resource, Task[].class)));
    }

    @Override
    public Task update(Integer id, Task task) {
        return restTemplate.exchange(idResource, HttpMethod.PUT, new HttpEntity<>(task), Task.class, id).getBody();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task findById(Integer id) {
        return null;
    }
}
