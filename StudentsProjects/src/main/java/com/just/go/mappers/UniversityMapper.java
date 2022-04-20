package com.just.go.mappers;

import com.just.go.aggregate.entity.University;
import com.just.go.store.jpo.UniversityJpo;
import org.mapstruct.Mapper;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StudentsProjects}
 * @Date: {2022/04/20 && 7:24 PM}
 */
@Mapper(componentModel = "spring", uses = {})
public interface UniversityMapper extends EntityMapper<University, UniversityJpo>{

}
