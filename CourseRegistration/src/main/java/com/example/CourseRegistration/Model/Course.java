package com.example.CourseRegistration.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private String courseId;
    private String courseName;
    private  String trainee;
    private int duration;
}
