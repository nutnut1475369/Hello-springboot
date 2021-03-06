package com.example.demo.services;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public Student getStudent(Long studentId){
        return studentRepository.getReferenceById(studentId);
    }

    public Student addStudent(Student newStudent){
        return studentRepository.save(newStudent);
    }

}
