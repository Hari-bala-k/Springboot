package com.example.SpringCRUD.Service;

import com.example.SpringCRUD.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
           Arrays.asList(
                   new Student(101,"hari","java"),
                   new Student(102,"krish","js"),
                   new Student(103,"kris","react"))
    );

    public Student showDetails(int id){
        int index=0;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getStuId()==id){
                index=i;
            }
        }
        return students.get(index);
    }

    public List<Student> getData() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

