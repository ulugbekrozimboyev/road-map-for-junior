package com.just.go.store.storeImplementation;

import com.just.go.aggregate.entity.Student;
import com.just.go.store.jpo.StudentJpo;
import com.just.go.store.jpo.repository.StudentRepository;
import com.just.go.util.exception.NoSuchStudentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 9:42 PM}
 */
@Repository
public class StudentDBImplem implements StudentStore {
    //
    @Autowired
    StudentRepository studentRepository;

    @Override
    public String create(Student student) {
        StudentJpo studentJpo = new StudentJpo(student);
        studentJpo = studentRepository.save(studentJpo);
        return String.valueOf(" Store to DB: "+  studentJpo.getId()+ "   " +studentJpo.getName() + " " + studentJpo.getLastName());
    }

    @Override
    public Student retrieve(String studentId) {
        if (studentRepository.findById(Long.valueOf(studentId)).isPresent()) {
            StudentJpo studentJpo = studentRepository.findById(Long.valueOf(studentId)).get();
            Student student = studentJpo.toDomain();
            student.setId(String.valueOf(studentJpo.getId()));
            return student;
        }
        throw new NoSuchStudentException("No student in the id -> " + studentId);
    }

    @Override
    public List<Student> retrieveByName(String name) {
        List<StudentJpo> jpos = studentRepository.findAllByName(name);

        return StudentJpo.toDomains(jpos);
    }

    @Override
    public void update(Student student) {
        StudentJpo studentJpo = new StudentJpo(student);
        studentJpo.setId(Long.valueOf(student.getId()));
        studentRepository.findById(studentJpo.getId())
                .orElseThrow(() -> new NoSuchStudentException("No student with id --> " + student.getId()));
        studentRepository.save(studentJpo);
    }

    @Override
    public void delete(String studentId) {

        if (exists(studentId)) {
            studentRepository.deleteById(Long.valueOf(studentId));
            return;
        }
        throw new NoSuchStudentException("No such with this id --> " + studentId);
    }


    @Override
    public boolean exists(String studentId) {
        return studentRepository.findById(Long.valueOf(studentId)).isPresent();
    }

    @Override
    public Page<StudentJpo> retrieveAll(Pageable pageable) {
        //return studentRepository.findAll(pageable.getNumberOfPages());;
        return null;
    }
}