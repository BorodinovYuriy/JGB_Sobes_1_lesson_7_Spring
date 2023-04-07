package ru.bor.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bor.entities.Student;
import ru.bor.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PostMapping
    public List<Student> addStudent(@RequestBody Student newStudent){
        studentService.addStudent(newStudent);
        return studentService.getAllStudent();
    }
    @DeleteMapping("/{id}")
    public List<Student> removeStudent(@PathVariable Long id){
        studentService.removeStudent(id);
        return studentService.getAllStudent();
    }

}
