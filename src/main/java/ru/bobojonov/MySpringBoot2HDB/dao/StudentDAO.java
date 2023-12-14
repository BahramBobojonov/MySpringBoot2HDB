package ru.bobojonov.MySpringBoot2HDB.dao;

import org.springframework.stereotype.Repository;
import ru.bobojonov.MySpringBoot2HDB.entity.Student;
import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int id);
}