package com.example.springJPA.Controller;

import com.example.springJPA.Model.Student;
import com.example.springJPA.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> readStudent(){
        return studentService.getStudentDetails();
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }
    @PostMapping("/students")
    public String creatStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Success..";
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Updated..";
    }
    @DeleteMapping("/students")
    public String deleteAllStudent(Student student){
        studentService.deleteAllStudent(student);
        return"cleared..";
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "deleted";
    }
    @GetMapping("/students/technology/{tech}")
    public List<Student> getStudentByTech(@PathVariable("tech") String technology){
        return studentService.studentByTech(technology);
    }
    @GetMapping("/students/filter")
    public List<Student> getStudentByIdAndTech(@RequestParam ("stuID") int stuID,@RequestParam("stuTech") String stuTech){
        return studentService.getStudentByIdAndTech(stuID,stuTech);
    }
}
