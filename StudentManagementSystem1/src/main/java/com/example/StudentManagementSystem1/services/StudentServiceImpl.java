package com.example.StudentManagementSystem1.services;


import com.example.StudentManagementSystem1.models.Students;
import com.example.StudentManagementSystem1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Students>getAllStudents(){
       return studentRepository.findAll();
    }

}
