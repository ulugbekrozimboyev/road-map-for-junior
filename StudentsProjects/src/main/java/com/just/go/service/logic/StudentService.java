package com.just.go.service.logic;

import com.just.go.aggregate.entity.Student;
import com.just.go.service.sdo.StudentCdo;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 10:21 PM}
 */
public interface StudentService {
    //
    String registerStudent(StudentCdo studentCdo);
    Student findStudentById(String id);
    List<Student> findStudentByName(String name);
   // List<Student> findStudents();
    void modify(String studentId);
    void remove(String studentId);
}
