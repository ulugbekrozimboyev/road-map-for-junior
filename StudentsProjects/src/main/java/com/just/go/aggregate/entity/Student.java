package com.just.go.aggregate.entity;

import com.just.go.aggregate.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 6:38 PM}
 */
@Getter
@Setter
@NoArgsConstructor
public class Student extends Entity {
    //
    private String name;
    private String lastName;
    private String studentCard;

    public Student(String id) {
        super(id);
    }

    public Student(String name, String lastName, String studentId) {
        super(studentId);
        this.name = name;
        this.lastName = lastName;
        this.studentCard = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentCard + '\'' +
                '}';
    }

    public static Student sample(){
        //
        String name = "Ali";
        String lastName = "Borisov";
        String studentId = "0032";

        return new Student(name, lastName, studentId);
    }
}
