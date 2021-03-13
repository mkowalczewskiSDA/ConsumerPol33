package com.example.Consumer.model;

public class Task {
    private Integer id;
    private String description;
    private boolean completed;
    private Integer completedPercentage;
    private User user;

    public Task() {
    }

    public Task(Integer id, String description, boolean completed, Integer completedPercentage, User user) {
        this.id = id;
        this.description = description;
        this.completed = completed;
        this.completedPercentage = completedPercentage;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Integer getCompletedPercentage() {
        return completedPercentage;
    }

    public void setCompletedPercentage(Integer completedPercentage) {
        this.completedPercentage = completedPercentage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
