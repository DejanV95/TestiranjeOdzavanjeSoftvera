package com.example.demo.student.repository;

import com.example.demo.student.entity.Student;
import com.example.demo.student.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;


import java.time.LocalDate;

import static java.util.Calendar.FEBRUARY;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


    @RunWith(SpringRunner.class)
    @SpringBootTest
    @Component
    class StudentRepositoryTest {



    @Autowired
    private StudentRepository underTest;

    @Test
    void ItShouldCheckIfStudentExistsEmail() {
        //given
        String email = "marko.demomail@gmail.com";
        Student student = new Student(
                "Marko",
                email,
                LocalDate.of(2000, 2, 5)
        );

        underTest.save(student);

        //when
        boolean expected = underTest.selectExistsEmail(email);

        //then
        assertThat(expected).isTrue();
    }


}