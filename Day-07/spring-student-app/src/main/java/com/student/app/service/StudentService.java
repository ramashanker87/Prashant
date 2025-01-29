package com.student.app.service;

import com.student.app.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {
Map<String, Student> studentMap = new HashMap<>();

    //to create new student
    public Map<String, Student> createStudent(@RequestBody Student student){
        studentMap.put(student.getName(), student);
        return studentMap;
    }
    // to read the student
    public Student readStudent(@RequestParam String name){
                return studentMap.get(name);
    }

    // To delete the student
    public void deleteStudent(@RequestParam String name){
            studentMap.remove(name);
    }

    //To update the student
    public Student updateStudent(@RequestParam String name, @RequestParam int age){
        Student students= studentMap.get(name);
        students.setName(name);
        students.setAge(age);

        studentMap.put(students.getName(), students);
        return students;
    }
}
