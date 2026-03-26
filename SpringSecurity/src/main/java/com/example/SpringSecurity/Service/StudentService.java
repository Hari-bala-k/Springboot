package com.example.SpringSecurity.Service;

import com.example.SpringSecurity.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList( new Student(101,"hari"),
                    new Student(102,"hari bala"))
    );
    public List<Student> getStudent() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void deleteStudent(int id) {
        int index=0;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getStuId() == id) index=i;
        }
        students.remove(index);
    }
}
