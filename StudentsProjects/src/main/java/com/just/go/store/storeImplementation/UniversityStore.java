package com.just.go.store.storeImplementation;

import com.just.go.aggregate.entity.University;
import com.just.go.store.jpo.UniversityJpo;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 10:01 PM}
 */
public interface UniversityStore {
    //
    String create(University university);
    University retrieve(String universityId);
    List<University> retrieveByName(String universityName);
    void update(University university);
    void delete(String universityId);
    boolean exists(String universityId);
    Page<UniversityJpo> retrieveAll(Pageable pageable);
}
