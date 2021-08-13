package com.tutorial.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
          Student polat =new Student(
                    "POLAT",
                    "polat@gmail.com",
                    LocalDate.of(1998, Month.MARCH,7)

            );
            Student ozgur =new Student(
                    "OZGUR",
                    "ozgur@gmail.com",
                    LocalDate.of(1997, Month.MARCH,7)

            );
            repository.saveAll(
                    List.of(polat,ozgur)
            );

        };
    }
}
