package com.just.go.store.jpo;

import com.just.go.aggregate.entity.Student;
import com.just.go.aggregate.entity.University;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 7:30 PM}
 */
@Table(name = "university")
@Getter
@Setter
@NoArgsConstructor
public class UniversityJpo implements Serializable {
    //
    private static final long serialVersionUID = 1L;

    private Long id;
    private String universityName;
    private String address;
    private String faculty;

    public UniversityJpo(University university){
        BeanUtils.copyProperties(university, this);
    }

    public University toDomain(){
        University university = new University();
        BeanUtils.copyProperties(this, university);
        university.setId(String.valueOf(this.getId()));
        return university;
    }

    public static List<University> toDomains(List<UniversityJpo> jpos){
        return jpos
                .stream()
                .map(UniversityJpo::toDomain)
                .collect(Collectors.toList());
    }
}
