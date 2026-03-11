package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.studentDTO;
import com.example.demo.services.studentService;

@RestController
@RequestMapping(path="api/student")

public class studentController{

    //@Autowired //get the bean called studentRepository
    //private studentRepository studentRepository;
    @Autowired
    private studentService studentService;

@PostMapping(path="/add")
public @ResponseBody String addNewStudent(@Validated @RequestBody studentDTO studentDto) { 
    // Apply validation rules to studentDTO fields (e.g., email) 
    // since the request body provides user input that must be checked
    String response=studentService.createStudent(studentDto);
    return response;
}
//     // 1. Call the builder for the 'student' Entity (the one in com.example.demo.models)
//     student stu = student.builder() 
//         .name(studentDto.getName())
//         .email(studentDto.getEmail())
//         .build();

//     // 2. Save the entity
//     studentRepository.save(stu);
    
//     return "Saved";
// }
   
    @GetMapping(path="/")
    public @ResponseBody String getMethodName(){
        return "Hi";
    }}


