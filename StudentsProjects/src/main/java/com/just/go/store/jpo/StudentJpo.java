package com.just.go.store.jpo;

import com.just.go.aggregate.entity.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 8:52 PM}
 */

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class StudentJpo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String studentCard;

    public StudentJpo(Student student){
        BeanUtils.copyProperties(student, this);
    }

    public Student toDomain(){
        Student student = new Student();
        BeanUtils.copyProperties(this, student);
        student.setId(String.valueOf(this.getId()));
        return student;
    }

    public static List<Student> toDomains(List<StudentJpo> jpos){
        return jpos
                .stream()
                .map(StudentJpo::toDomain)
                .collect(Collectors.toList());
    }
}
