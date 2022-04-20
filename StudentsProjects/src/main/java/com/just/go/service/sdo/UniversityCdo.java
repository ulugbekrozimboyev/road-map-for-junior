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
 * @Date: {2022/04/20 && 7:28 PM}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UniversityCdo implements Serializable {

    private String universityName;
    private String address;
    private String faculty;

}
