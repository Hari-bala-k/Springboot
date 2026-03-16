package com.example.SpringCRUD.Service;

import com.example.SpringCRUD.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(101, "hari", "java"),
                    new Student(102, "krish", "js"),
                    new Student(103, "kris", "react")
            )
    );

    public List<Student> getData() {
        return students;
    }

    public Student readStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStuId() == id) {
                return students.get(i);
            }
        }
        throw new RuntimeException("Student not found");
    }

    public void creatStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStuId() == student.getStuId()) {
                students.set(i, student);
                return;
            }
        }
        throw new RuntimeException("Student not found");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStuId() == id) {
                students.remove(i);
                return;
            }
        }
        throw new RuntimeException("Student not found");
    }
}