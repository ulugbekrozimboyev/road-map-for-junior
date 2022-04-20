package com.just.go.store.jpo.repository;

import com.just.go.store.jpo.UniversityJpo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 9:59 PM}
 */
public interface UniversityRepository extends JpaRepository<UniversityJpo, Long> {

    List<UniversityJpo> findAllByName(String name);

    Page<UniversityJpo> findAll(int numberOfPages);
}
