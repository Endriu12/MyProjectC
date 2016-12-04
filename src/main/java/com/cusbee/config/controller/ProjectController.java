package com.cusbee.config.controller;

import com.cusbee.config.entity.Project;
import com.cusbee.config.repository.ProjectRepository;
import com.cusbee.config.serviceIMPL.ProjectServiceIMPL;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Endriu on 01.12.2016.
 */

@RestController
@RequestMapping(value = "/project")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectServiceIMPL  projectServiceIMPL;


    @ApiOperation(value = "I dont know what it is")
    @RequestMapping(value = "all_projects", method = RequestMethod.GET)
    public List<Project> getAll() {
        return projectRepository.getAll();
    }

//Ось тут я хочу щоб можна було доавати новий проект но воно типу автоматично додає, як зробити щоб можна було заносити
    //всі значення проекту, треба DTO створювати чи як?

    @ApiOperation(value = "method add new Project")
    @RequestMapping(value = "add_project", method = RequestMethod.POST)
    public Project addProjet() {
        Project  project = new Project();
        return projectServiceIMPL.addProjet(project);
    }
}
