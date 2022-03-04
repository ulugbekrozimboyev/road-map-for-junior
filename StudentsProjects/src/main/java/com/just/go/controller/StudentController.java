package com.just.go.controller;

import com.just.go.aggregate.entity.Student;
import com.just.go.service.logic.StudentService;
import com.just.go.service.sdo.StudentCdo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 8:46 PM}
 */
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    ResponseEntity registerStudent(@RequestBody StudentCdo studentCdo){
        return ResponseEntity.ok(studentService.registerStudent(studentCdo));
    }

    @GetMapping("/name/{studentName}")
    List<Student> retrieveByName(@PathVariable String studentName){
        return studentService.findStudentByName(studentName);
    }

    @GetMapping(value = "/id/{studentId}", produces = "application/json")
    Student findStudentById(@PathVariable String studentId){
        return studentService.findStudentById(studentId);
    }
}
