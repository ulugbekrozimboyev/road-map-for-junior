package com.just.go.mappers;

import com.just.go.aggregate.entity.Student;
import com.just.go.store.jpo.StudentJpo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface StudentMapper extends EntityMapper<Student, StudentJpo>{

}
