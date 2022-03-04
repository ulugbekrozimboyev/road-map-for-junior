package com.just.go.util.exception;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 10:10 PM}
 */
public class NoSuchStudentException extends RuntimeException{
    //
    private static final long serialVersionUID = 5867172506387382920L;

    public NoSuchStudentException(String message){
        super(message);
    }
}
