package com.cusbee.config.repository;

import com.cusbee.config.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Endriu on 02.12.2016.
 */
public interface TaskRepository  extends JpaRepository<Task, Long> {
    @Query(value = "select * from task", nativeQuery = true)
    List<Task> getAll();
}
