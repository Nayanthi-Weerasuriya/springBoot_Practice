package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path="api/student")

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public @ResponseBody String addNewStudent(@RequestBody String name,@RequestBody String email,@RequestBody String contactNo) {
        
        Student stu = new Student();
        stu.setName(name);
        stu.setEmail(email);
        stu.setContactNo(contactNo);
        studentRepository.save(stu);
        return "Saved";
    }
    
}
