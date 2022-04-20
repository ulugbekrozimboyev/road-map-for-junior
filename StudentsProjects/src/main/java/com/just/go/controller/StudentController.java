package com.just.go.controller;

import com.just.go.aggregate.entity.Student;
import com.just.go.service.logic.StudentService;
import com.just.go.service.sdo.StudentCdo;
import com.just.go.store.jpo.StudentJpo;
import com.just.go.util.exception.NoSuchStudentException;
import io.github.jhipster.web.util.PaginationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
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
    public StudentService studentService;

    @GetMapping("/all")
    ResponseEntity getAll(@RequestParam("page") int pageIndex,
                          @RequestParam("size") int pageSize,
                          @RequestParam MultiValueMap<String, String> queryParams,
                          UriComponentsBuilder uriBuilder){
        Page<Student> page = studentService.findAllStudents(PageRequest.of(pageIndex, pageSize));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(uriBuilder.queryParams(queryParams), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

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

    @PutMapping("/{studentId}")
    public ResponseEntity modifyStudent(@PathVariable String studentId,
                                                @Valid
                                                @RequestBody StudentCdo studentDetails) throws NoSuchStudentException{
        Student student = studentService.findStudentById(studentId);
                           // .orElseThrow(() -> new NoSuchStudentException("Student not found on: "  + studentId));

        student.setName(studentDetails.getName());
        student.setLastName(studentDetails.getLastName());
        student.setStudentCard(studentDetails.getStudentCard());

       // Student updateStudent = studentService.registerStudent(student);

     // return ResponseEntity.ok(updateStudent);
      return ResponseEntity.ok("{\"message\":\"Student updated successfully\"}");
    }

    @DeleteMapping("/{studentId}")
    ResponseEntity<String> remove(@PathVariable String studentId){
        studentService.remove(studentId);
        return ResponseEntity.ok("{\"message\":\"Student delete successfully\"}");
    }
}