package com.just.go.store.storeImplementation;

import com.just.go.aggregate.entity.University;
import com.just.go.store.jpo.UniversityJpo;
import com.just.go.store.jpo.repository.UniversityRepository;
import com.just.go.util.exception.NoSuchUniversityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 10:01 PM}
 */
public class UniversityDBImp implements UniversityStore{
     //
    @Autowired
    public UniversityRepository universityRepository;

    @Override
    public String create(University university) {
        UniversityJpo universityJpo = new UniversityJpo(university);
        universityJpo = universityRepository.save(universityJpo);
        return String.valueOf("Store: " + universityJpo.getUniversityName() + " " + universityJpo.getAddress() + "  " + universityJpo.getFaculty());
    }

    @Override
    public University retrieve(String universityId) {
        if (universityRepository.findById(Long.valueOf(universityId)).isPresent()){
            UniversityJpo universityJpo = universityRepository.findById(Long.valueOf(universityId)).get();
            University university = universityJpo.toDomain();
            university.setId(String.valueOf(universityJpo.getId()));
            return university;
        }
         throw new NoSuchUniversityException("No university id: " + universityId);
    }

    @Override
    public List<University> retrieveByName(String universityName) {
       List<UniversityJpo> jpos = universityRepository.findAllByName(universityName);
        return UniversityJpo.toDomains(jpos);
    }

    @Override
    public void update(University university) {
        UniversityJpo universityJpo = new UniversityJpo(university);
        universityJpo.setId(Long.valueOf(university.getId()));
        universityRepository.findById(universityJpo.getId())
                .orElseThrow(()-> new NoSuchUniversityException("NO university with ID: " + university.getId()));
        universityRepository.save(universityJpo);
    }

    @Override
    public void delete(String universityId) {
        //
        if (exists(universityId)){
            universityRepository.deleteById(Long.valueOf(universityId));
            return;
        }
        throw new NoSuchUniversityException("No such with this id -> " + universityId);
    }

    @Override
    public boolean exists(String universityId) {
        return universityRepository.findById(Long.valueOf(universityId)).isPresent();
    }

    @Override
    public Page<UniversityJpo> retrieveAll(Pageable pageable) {
        return universityRepository.findAll(pageable.getNumberOfPages());
    }
}