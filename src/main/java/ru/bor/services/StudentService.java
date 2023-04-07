package ru.bor.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bor.entities.Student;
import ru.bor.repositories.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    public void addStudent(Student newStudent) {
        studentRepository.save(newStudent);
    }

    public void removeStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
