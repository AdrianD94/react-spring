package com.backendapp1.backendapp1.repositories;

import com.backendapp1.backendapp1.Domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

}
