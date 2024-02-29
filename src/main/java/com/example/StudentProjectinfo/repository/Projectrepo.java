package com.example.StudentProjectinfo.repository;

import com.example.StudentProjectinfo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Projectrepo extends JpaRepository<Project,Integer> {
}
