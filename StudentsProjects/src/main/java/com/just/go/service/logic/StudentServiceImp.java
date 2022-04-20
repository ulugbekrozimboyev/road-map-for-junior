package com.just.go.service.logic;

import com.just.go.aggregate.entity.Student;
import com.just.go.mappers.StudentMapper;
import com.just.go.service.sdo.StudentCdo;
import com.just.go.store.storeImplementation.StudentStore;
import com.just.go.util.exception.NoSuchStudentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 10:31 PM}
 */
@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentStore studentStore;

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public String registerStudent(StudentCdo studentCdo) {
        Student student = new Student(studentCdo.getName(), studentCdo.getLastName(), studentCdo.getStudentCard());

        return studentStore.create(student);
    }

    @Override
    public Student findStudentById(String id) {
        return studentStore.retrieve(id);
    }

    @Override
    public List<Student> findStudentByName(String name) {
        return studentStore.retrieveByName(name);
    }

//    @Override
//    public List<Student> findStudents() {
//        return studentStore.retrieveStudents();
//    }

    @Override
    public void modify(String studentId) {
        Student student = studentStore.retrieve(studentId);
        if(student !=null){
            studentStore.update(student);
            return;
        }
        throw new NoSuchStudentException("No student found now.");
    }

    @Override
    public void remove(String studentId) {
        studentStore.delete(studentId);
    }

    @Override
    public Page<Student> findAllStudents(Pageable pageable) {
        return studentStore.retrieveAll(pageable)
                .map(studentMapper::toDto);
    }

//    @Override
//    public Page<Student> findAll(Pageable pageable) {
//        return studentStore.findAll(pageable)
//                .map(studentMapper::toDto);
//    }
}
