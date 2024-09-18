package com.salehbg.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Saleh",
                        "Ben Ghorbel",
                        LocalDate.now(),
                        "saleh@gmail.com",
                        34

                ),
                new Student(
                        "Bibo10",
                        "Rami",
                        LocalDate.now(),
                        "rami@gmail.com",
                        32

                )


        );
    }
}
