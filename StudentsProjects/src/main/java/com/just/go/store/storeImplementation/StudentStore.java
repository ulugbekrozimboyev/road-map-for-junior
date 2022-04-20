package com.just.go.store.storeImplementation;

import com.just.go.aggregate.entity.Student;
import com.just.go.store.jpo.StudentJpo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
    boolean exists(String studentId);
    Page<StudentJpo> retrieveAll(Pageable pageable);
}
