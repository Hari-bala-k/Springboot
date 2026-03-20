package com.example.springJPA.Services;

import com.example.springJPA.Model.Student;
import com.example.springJPA.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    public List<Student> getStudentDetails() {
        return studentRepo.findAll();
    }


    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteAllStudent(Student student) {
        studentRepo.deleteAll();
    }

    public Student getStudent(int id) {
        return studentRepo.findById(id).orElse(null);
    }

    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }

    public List<Student> studentByTech(String technology) {
        return studentRepo.findBystuTech(technology);
    }

    public List<Student> getStudentByIdAndTech(int stuID, String stuTech) {
        return studentRepo.findByIdAndTech(stuID,stuTech);
    }

    public List<Student> getStudentByGenAndTech(String tech, String gender) {
        return studentRepo.findByTechAndGender(tech,gender);
    }
}
