package com.example.CourseRegistration.Controller;

import com.example.CourseRegistration.Model.Course;
import com.example.CourseRegistration.Model.CourseRegistry;
import com.example.CourseRegistration.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return courseService.getCourse();
    }
    @GetMapping("/courses/enroll")
    public List<CourseRegistry> getEntrolldetails(){
        return courseService.getEnroll();
    }

    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return "success!!";
    }
    @PostMapping("/courses/register")
    public String  Registration(@RequestParam("name") String name,
                                                 @RequestParam("emailId") String emailId,
                                                 @RequestParam("courseName") String courseName){
         courseService.getCourseRegistry(name,emailId,courseName);
         return "Congracts "+name+" successfully registered "+courseName;

    }


}
