package com.example.demo.student.service;

import com.example.demo.student.repository.StudentRepository;
import com.example.demo.student.entity.Student;
import com.example.demo.student.exception.BadRequestException;
import com.example.demo.student.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
@Configurable
public class StudentService {



    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
       return students;
    }

//    public void addNewStudent(Student student) {
//        Optional<Student> studentOptional = studentRepository
//        .findStudentByEmail(student.getEmail());
//        if (studentOptional.isPresent()) {
//            throw new IllegalStateException("email taken");
//        }
//       studentRepository.save(student);
//    }
//
//    public void deleteStudent(Long studentId) {
//       boolean exists = studentRepository.existsById(studentId);
//        if (!exists){
//            throw new IllegalStateException("student with id " + studentId + " does not exist");
//        }
//        studentRepository.deleteById(studentId);
//    }

    public void addStudent(Student s) {
        studentRepository.save(s);
    }

//    public void addStudent(Student student) {
//        Boolean existsEmail = studentRepository
//                .selectExistsEmail(student.getEmail());
//        if (existsEmail) {
//            throw new BadRequestException(
//                    "Email " + student.getEmail() + " taken");
//        }
//
//        studentRepository.save(student);
//    }

    public void deleteStudent(Long studentId) {

        studentRepository.deleteById(studentId);
    }

//    public void deleteStudent(Long studentId) {
//        if(!studentRepository.existsById(studentId)) {
//            throw new StudentNotFoundException(
//                    "Student with id " + studentId + " does not exists");
//        }
//        studentRepository.deleteById(studentId);
//    }



//    @Transactional
//    public void updateStudent(Long studentId,
//                              String name,
//                              String email) {
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new IllegalStateException(
//                        "student with id " + studentId + " does not exist"));
//
//        if (name != null &&
//                name.length() > 0 &&
//                !Objects.equals(student.getName(), name)) {
//            student.setName(name);
//        }
//
//        if (email != null &&
//                email.length() > 0 &&
//                !Objects.equals(student.getEmail(), email)) {
//            Optional<Student> studentOptional = studentRepository
//                    .findStudentByEmail(email);
//            if (studentOptional.isPresent()){
//                throw new IllegalStateException("email taken");
//            }
//            student.setEmail(email);
//        }

    //}
}
