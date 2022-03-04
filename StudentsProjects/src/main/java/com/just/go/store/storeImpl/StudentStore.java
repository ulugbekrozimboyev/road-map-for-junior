package com.just.go.store.storeImpl;

import com.just.go.aggregate.entity.Student;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 7:12 PM}
 */
public interface StudentStore {
    //
    String create(Student student);
    Student retrieve(String studentId);
    List<Student> retrieveByName(String name);
    void update(Student student);
    void delete(String studentId);
   // List<Student> retrieveStudents();
    boolean exists(String studentId);


}
