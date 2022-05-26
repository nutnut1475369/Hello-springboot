package com.example.demo.controllers;

import com.example.demo.services.StudentService;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;


    @Autowired
    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity<String> getAllStudent(){
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getAllStudent().toString());
    }
    @GetMapping
    public ResponseEntity<String> getStudent(@RequestParam Long id){
        System.out.println(id);
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.getStudent(id).toString());
    }
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student newStudent){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(studentService.addStudent(newStudent).toString());
    }
}
