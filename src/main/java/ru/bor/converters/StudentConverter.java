package ru.bor.converters;

import org.springframework.stereotype.Component;
import ru.bor.dto.StudentDto;
import ru.bor.entities.Student;

@Component
public class StudentConverter {

    public Student dtoToEntity(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getAge()
        );
    }

    public StudentDto entityToDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getName(),
                student.getAge()
        );
    }
}
