package com.cusbee.config.repository;

import com.cusbee.config.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Endriu on 02.12.2016.
 */
public interface ProjectRepository extends JpaRepository<Project, Long>
{
    @Query(value = "select * from project", nativeQuery = true)
    List<Project> getAll();
}
