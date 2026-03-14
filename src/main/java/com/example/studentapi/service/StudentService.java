package com.example.studentapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentapi.model.Student;
import com.example.studentapi.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents() {
        return repository.getAllStudents();
    }

    public void addStudent(Student student) {
        repository.addStudent(student);
    }

    public void updateStudent(int id, Student student) {
        repository.updateStudent(id, student);
    }

    public void deleteStudent(int id) {
        repository.deleteStudent(id);
    }
}