package com.example.StudentProjectinfo.service;

import com.example.StudentProjectinfo.dto.ProjectRequest;
import com.example.StudentProjectinfo.exception.UserNotFoundException;
import com.example.StudentProjectinfo.model.Project;
import com.example.StudentProjectinfo.repository.Projectrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Projectservice {
    @Autowired
    private Projectrepo repo;

    public Project saveproject(ProjectRequest projectrequest)
    {
        Project project = new Project();
        project.setRollno(projectrequest.getRollno());
        project.setName(projectrequest.getName());
        project.setBatch(projectrequest.getBatch());
        project.setEmail(projectrequest.getEmail());
        project.setPhone(projectrequest.getPhone());
        project.setDepartment(projectrequest.getDepartment());
        project.setSemester(projectrequest.getSemester());
        project.setProjectname(projectrequest.getProjectname());
        project.setDescription(projectrequest.getDescription());
        project.setStatus(projectrequest.getStatus());
        project.setSupervisor(projectrequest.getSupervisor());
        project.setHodname(projectrequest.getHodname());
        project.setDate(projectrequest.getDate());
        project.setTopic(projectrequest.getTopic());
        project.setGithublink(projectrequest.getGithublink());
        project.setProjectlink(projectrequest.getProjectlink());

        return repo.save(project);
    }
    public List<Project> getALlProjects() {
        return repo.findAll();
    }

    public Project getProjectByRollno(String rollno) throws UserNotFoundException {
        Project p = repo.findByRollno(rollno);
        if(p != null){
            return p;
        } else {
            throw new UserNotFoundException("User not found with roll number: " + rollno);
        }
    }


}