package com.example.demo.student.config;

import com.example.demo.student.entity.Student;
import com.example.demo.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//        return args -> {
//
//                    Student marko = new Student(
//                            "Marko",
//                            "marko.demomail@gmail.com",
//                            LocalDate.of(2000, JANUARY, 5)
//                    );
//
//                    Student ivan = new Student(
//                            "Ivan",
//                            "ivan.demomail@gmail.com",
//                            LocalDate.of(2004, FEBRUARY, 5)
//                      );
//
//                    Student milos = new Student(
//                    "Milos",
//                    "milos.demomail@gmail.com",
//                    LocalDate.of(2004, MARCH, 5)
//            );
//
//                     Student vuk = new Student(
//                    "Vuk",
//                    "vuk.demomail@gmail.com",
//                    LocalDate.of(2004, APRIL, 5)
//            );
//
//            repository.saveAll(
//                    List.of(marko, ivan, milos, vuk)
//            );
//
//
//
//        };
//
//    }
//}
