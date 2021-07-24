package org.id2k1149.project_v4.config;

import org.id2k1149.project_v4.models.Student;
import org.id2k1149.project_v4.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@test.test",
                    LocalDate.of(1940, OCTOBER, 9),
                    40
            );

            Student paul =new Student(
                    "Paul",
                    "paul@test.test",
                    LocalDate.of(1942, JUNE, 18),
                    79
            );

            studentRepository.saveAll(
                    List.of(john, paul)
            );
        };
    }
}
