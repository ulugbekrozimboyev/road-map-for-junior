package com.just.go.store.jpo.repository;

import com.just.go.aggregate.entity.Student;
import com.just.go.store.jpo.StudentJpo;
import com.just.go.store.jpo.UniversityJpo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 8:28 PM}
 */


public interface StudentRepository extends JpaRepository<StudentJpo, Long> {
        //
        List<StudentJpo> findAllByName(String name);
      //  List<StudentJpo> findAllStudents();
      Page<StudentJpo> findAll(int numberOfPages);

}