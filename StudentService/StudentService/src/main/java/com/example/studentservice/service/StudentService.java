package com.example.studentservice.service;

import com.example.studentservice.entity.Student;
import com.example.studentservice.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    public Student insertStudent(Student student) {
        return studentRepo.save(student);
    }
}
