package com.prashant.app.service;

import com.prashant.app.model.Student;
import com.prashant.app.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public String saveStudent( Student student) {
        studentRepo.save(student);
        return student.getName()+ " is saved to the database";
    }
}
