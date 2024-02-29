package com.example.StudentProjectinfo.controller;

import com.example.StudentProjectinfo.dto.ProjectRequest;
import com.example.StudentProjectinfo.model.Project;
import com.example.StudentProjectinfo.service.Projectservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class Projectcontroller {
    @Autowired
    private Projectservice projectservice;

    @PostMapping("/addproject")
    public ResponseEntity<Project> saveproject(@RequestBody @Valid ProjectRequest projectrequest) {
        return new ResponseEntity<>(projectservice.saveproject(projectrequest),HttpStatus.CREATED);
    }
}
