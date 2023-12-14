package ru.bobojonov.MySpringBoot2HDB.service;

import org.springframework.stereotype.Service;
import ru.bobojonov.MySpringBoot2HDB.entity.Course;
import java.util.List;
@Service
public interface CourseService {
    List<Course> getAllCourses();

    Course getCourse(int id);

    Course saveCourse(Course course);

    void deleteCourse(int id);
}