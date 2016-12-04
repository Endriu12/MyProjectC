package com.cusbee.config.serviceIMPL;

import com.cusbee.config.entity.Project;
import com.cusbee.config.repository.ProjectRepository;
import com.cusbee.config.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Endriu on 03.12.2016.
 */
@Service
public class ProjectServiceIMPL implements ProjectService {

       @Autowired
       private ProjectRepository projectRepository;

    @Override
    public Project addProjet(Project project) {
        Project savedProject = projectRepository.saveAndFlush(project);

        return  savedProject;
    }

    @Override
    public void delete(long id) {
        projectRepository.delete(id);

    }

    @Override
    public Project editProject(Project project) {
        return projectRepository.saveAndFlush(project);
    }

    @Override
    public List<Project> getAll() {
        return  projectRepository.findAll();
    }
}
