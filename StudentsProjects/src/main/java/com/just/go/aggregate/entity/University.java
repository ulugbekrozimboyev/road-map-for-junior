package com.just.go.aggregate.entity;

import com.just.go.aggregate.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 6:55 PM}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class University extends Entity implements Serializable {
    //
    private String universityName;
    private String address;
    private String faculty;

    public static University sample(){
        //
        String universityName = "Yoeju";
        String address = "Tashkent, Uzbekistan";
        String faculty = "Applied Informatics";

        return new University(universityName, address, faculty);
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
