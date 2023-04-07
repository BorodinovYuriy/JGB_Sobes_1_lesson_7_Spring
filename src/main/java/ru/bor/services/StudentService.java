package ru.bor.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.bor.repositories.StudentRepository;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

}
