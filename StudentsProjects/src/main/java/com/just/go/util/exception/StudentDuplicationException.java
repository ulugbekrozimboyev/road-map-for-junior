package com.just.go.util.exception;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/03/04 && 7:47 PM}
 */
public class StudentDuplicationException extends RuntimeException{
    //
    private static final long serialVersionUID = - 4246979292397269539L;

    public StudentDuplicationException(String message) {
        super(message);
    }
}
