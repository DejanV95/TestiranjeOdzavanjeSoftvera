package com.example.demo.student.repository;

import com.example.demo.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

import static java.time.Month.FEBRUARY;

//@Repository
//public interface StudentRepository
//        extends JpaRepository<Student, Long> {
//
//    //previously findStudentByEmail
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
//    Optional<Student> findStudentByEmail(String email);
//
//    @Query("" +
//            "SELECT CASE WHEN COUNT(s) > 0 THEN " +
//            "TRUE ELSE FALSE END " +
//            "FROM Student s " +
//            "WHERE s.email = ?1"
//    )
//    Boolean selectExistsEmail(String email);
//
//}

//selectExistsEmail

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    @Query("" +
            "SELECT CASE WHEN COUNT(s) > 0 THEN " +
            "TRUE ELSE FALSE END " +
            "FROM Student s " +
            "WHERE s.email = ?1"
    )
     Boolean selectExistsEmail(String email);
}

//class StudentRepositoryTest {
//
//    @Autowired
//    private StudentRepository underTest;
//
//    @Test
//    void ItShouldCheckIfStudentExistsEmail() {
//        //given
//        String email = "jelena.demomail@gmail.com";
//        Student student = new Student(
//                "Jelena",
//                email,
//                LocalDate.of(2000, FEBRUARY, 5)
//        );
//
//        underTest.save(student);
//
//        //when
//        boolean expected = underTest.selectExistsEmail(email);
//
//        //then
//        assertThat(expected).isTrue();
//    }
//
//
//}