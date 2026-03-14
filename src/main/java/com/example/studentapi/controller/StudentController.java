package com.example.studentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentapi.model.Student;
import com.example.studentapi.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    // READ
    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    // CREATE
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return "Student added successfully";
    }

    // UPDATE
    @PutMapping("/students/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {
        service.updateStudent(id, student);
        return "Student updated successfully";
    }

    // DELETE
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}