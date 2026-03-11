package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.studentDTO;
import com.example.demo.models.student;
import com.example.demo.repositories.studentRepository;

@Service
public class studentService {
     @Autowired //get the bean called studentRepository
    private studentRepository studentRepository;

public String createStudent(studentDTO Student) {
    student stu = student.builder()
            .name(Student.getName())   // use the DTO instance
            .email(Student.getEmail()) // use the DTO instance
            .build();
    studentRepository.save(stu);
    return "Saved";
}

}
