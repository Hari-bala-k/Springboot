package com.example.CourseRegistration.Services;

import com.example.CourseRegistration.Model.Course;
import com.example.CourseRegistration.Model.CourseRegistry;
import com.example.CourseRegistration.Repository.CourseRegistryRepo;
import com.example.CourseRegistration.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    CourseRegistry courseRegistry;

    public List<Course> getCourse() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> getEnroll() {
        return courseRegistryRepo.findAll();
    }

    public void getCourseRegistry(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry= new CourseRegistry(name,emailId,courseName);
         courseRegistryRepo.save(courseRegistry);
    }
}
