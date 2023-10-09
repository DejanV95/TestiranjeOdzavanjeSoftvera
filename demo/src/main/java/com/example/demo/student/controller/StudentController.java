package com.example.demo.student.controller;

import com.example.demo.student.service.StudentService;
import com.example.demo.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "api/v1/student")
@RequestMapping(path = "/api")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

//    @PostMapping
//    public void registerNewStudent(@RequestBody Student student){
//        studentService.addStudent(student);
//    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void registerNewStudent(@RequestBody Student student) {

        studentService.addStudent(student);
    }

    @DeleteMapping(path = "/{StudntId}")
    public void deleteStudent(
            @PathVariable("StudntId") Long studentId){
        studentService.deleteStudent(studentId);
    }

}
