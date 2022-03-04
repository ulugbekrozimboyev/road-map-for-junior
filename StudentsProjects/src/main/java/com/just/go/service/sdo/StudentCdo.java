package com.just.go.service.sdo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 10:22 PM}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentCdo implements Serializable {
    //
    private String name;
    private String lastName;
    private String studentCard;
}
