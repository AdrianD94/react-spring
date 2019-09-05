package com.backendapp1.backendapp1.services;

import com.backendapp1.backendapp1.Domain.Project;
import com.backendapp1.backendapp1.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);
    }

}
