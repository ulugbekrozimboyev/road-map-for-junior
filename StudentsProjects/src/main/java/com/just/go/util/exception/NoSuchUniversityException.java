package com.just.go.util.exception;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 7:12 PM}
 */
public class NoSuchUniversityException extends RuntimeException{
    //
    private static final long serialVersionUID = 5867172506387382920L;

    public NoSuchUniversityException(String message){
        super(message);
    }
}
