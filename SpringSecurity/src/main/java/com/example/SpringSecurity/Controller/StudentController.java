package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.Model.Student;
import com.example.SpringSecurity.Service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
   @Autowired
   StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/students")
    public String addStudents(@RequestBody Student student){
        studentService.addStudents(student);
        return "success";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudents(@PathVariable int id){
        studentService.deleteStudent(id);
        return "deleted";
    }
}
