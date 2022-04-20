package com.just.go.util.exception;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 7:17 PM}
 */
public class UniversityDuplicationException extends RuntimeException{
    //
    private static final long serialVersionUID = - 4246979292397269539L;

    public UniversityDuplicationException(String message) {
        super(message);
    }
}
