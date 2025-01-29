package com.student.app.controller;

import com.student.app.model.Student;
import com.student.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Map<String, Student> postMapping(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/read")
    public  Student readStudent(String name){
        return studentService.readStudent(name);
    }

    @PutMapping("/put")
    public Student putStudent(String name, int age){
        return studentService.updateStudent(name,age);

    }

    @DeleteMapping("delete")
    public String deleteStudent(String name){
         studentService.deleteStudent(name);
         return (name+" is removed");

    }





}
