package ru.bor.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bor.converters.StudentConverter;
import ru.bor.dto.StudentDto;
import ru.bor.entities.Student;
import ru.bor.repositories.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;

    public List<StudentDto> getAllStudent() {
        return studentRepository.findAll().stream().
                map(studentConverter::entityToDto).toList();
    }
    public void addStudent(StudentDto newStudent) {
        studentRepository.save(studentConverter.dtoToEntity(newStudent));
    }

    public void removeStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
