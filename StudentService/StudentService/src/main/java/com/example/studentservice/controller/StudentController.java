package com.example.studentservice.controller;

import com.example.studentservice.entity.Library;
import com.example.studentservice.entity.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/Student/{id}")
    public Student getStudentById(@PathVariable  int id) {
        Library library = restTemplate.getForObject("http://localhost:9092/library/Library/"+id, Library.class);
        Student student = studentService.getStudentById(id);
        student.setLibrary(library);
        return student;
    }

    @PostMapping("/insert")
    public Student insertStudent(@RequestBody Student student) {
        System.out.println("================================");
        System.out.println(student.getName());
        System.out.println("================================");
        return studentService.insertStudent(student);
    }


}
