package com.example.CourseRegistration.Repository;

import com.example.CourseRegistration.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String > {
}
