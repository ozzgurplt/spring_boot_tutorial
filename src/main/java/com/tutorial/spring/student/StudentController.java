package com.tutorial.spring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    private  StudentService studentService;
    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);

    }
    @DeleteMapping(path = "{studentId},")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        studentService.deleteStudent(studentId);

    }

}
