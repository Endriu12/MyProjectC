package com.cusbee.config.service;

import com.cusbee.config.entity.Task;

import java.util.List;

/**
 * Created by Endriu on 03.12.2016.
 */
public interface TaskService {
    Task addTask(Task task);
    void delete(long id);
    Task editProject(Task task);
    List<Task> getAll();
}
