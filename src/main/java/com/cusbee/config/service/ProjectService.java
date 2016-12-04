package com.cusbee.config.service;

import com.cusbee.config.entity.Project;

import java.util.List;

/**
 * Created by Endriu on 02.12.2016.
 */
public interface ProjectService {
    Project addProjet(Project project);
    void delete(long id);
    Project editProject(Project project);
    List<Project> getAll();
}
