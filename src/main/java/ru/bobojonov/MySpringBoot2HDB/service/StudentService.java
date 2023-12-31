package ru.bobojonov.MySpringBoot2HDB.service;

import org.springframework.stereotype.Service;
import ru.bobojonov.MySpringBoot2HDB.entity.Student;
import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
    Student getStudent(int id);
    Student saveStudent(Student student);
    void deleteStudent(int id);
}
