package com.example.StudentManagementSystem1.controller;

import com.example.StudentManagementSystem1.services.StudentService;
import com.example.StudentManagementSystem1.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/students")
public class StudentController {
	
    @Autowired
    private StudentServiceImpl studentServiceimpl;
    
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String ListStudents(Model model){
        model.addAttribute("list",studentService.getAllStudents());
        System.out.println(model);
        return "StudentPage";
    }
}
