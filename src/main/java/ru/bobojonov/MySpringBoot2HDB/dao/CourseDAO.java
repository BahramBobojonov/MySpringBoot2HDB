package ru.bobojonov.MySpringBoot2HDB.dao;

import org.springframework.stereotype.Repository;
import ru.bobojonov.MySpringBoot2HDB.entity.Course;
import java.util.List;
@Repository
public interface CourseDAO {
    List<Course> getAllCourses();

    Course saveCourse(Course course);

    Course getCourse(int id);

    void deleteCourse(int id);
}