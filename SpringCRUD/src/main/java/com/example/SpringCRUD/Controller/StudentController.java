package com.example.SpringCRUD.Controller;

import com.example.SpringCRUD.Model.Student;
import com.example.SpringCRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "Student Home page";
    }
    @GetMapping("StudentData")
    public List<Student> getData(){
        return studentService.getData();
    }
    @GetMapping("/StudentData/{rNo}")
    public Student printStudent(@PathVariable("rNo") int rollNo){
        return studentService.showDetails(rollNo);
    }
    @PostMapping("/StudentData")
    public String addStudent( @RequestBody Student student){
        studentService.addStudent(student);
    return "success";
    }

}
