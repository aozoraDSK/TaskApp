package com.example.taskapp.model;

import jakarta.validation.constraints.NotEmpty;

import java.util.Date;

public class TaskDto {

    @NotEmpty
    private String title;

    private String description;

    @NotEmpty
    private Date dueDate;

    @NotEmpty
    private int priority;

    private String status;

    public TaskDto(String title, String description, Date dueDate, int priority, String status) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    public TaskDto() {
    }

    public @NotEmpty String getTitle() {
        return title;
    }

    public void setTitle(@NotEmpty String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @NotEmpty Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(@NotEmpty Date dueDate) {
        this.dueDate = dueDate;
    }

    @NotEmpty
    public int getPriority() {
        return priority;
    }

    public void setPriority(@NotEmpty int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
