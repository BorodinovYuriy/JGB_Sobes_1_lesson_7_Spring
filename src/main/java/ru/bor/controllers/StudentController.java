package ru.bor.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.bor.dto.StudentDto;
import ru.bor.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDto> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PostMapping
    public List<StudentDto> addStudent(@RequestBody StudentDto newStudent){
        studentService.addStudent(newStudent);
        return studentService.getAllStudent();
    }
    @DeleteMapping("/{id}")
    public List<StudentDto> removeStudent(@PathVariable Long id){
        studentService.removeStudent(id);
        return studentService.getAllStudent();
    }
    @PostMapping("/{old_id}")
    public List<StudentDto> editStudent(@PathVariable Long old_id,
                                        @RequestBody StudentDto editStudent){
        studentService.editStudent(old_id, editStudent);
        return studentService.getAllStudent();
    }

}
