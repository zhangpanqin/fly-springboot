package com.fly.mapstruct;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author 张攀钦
 * @date 2020-03-31-17:23
 */
@Mapper(uses = {TimeConvert.class})
public interface PersonConvert {
    PersonConvert PERSON_CONVERT = Mappers.getMapper(PersonConvert.class);

    @Mapping(target = "studentName", source = "name")
    @Mapping(target = "birthday", source = "birthday")
    Student personToStudent(Person person);

    @InheritInverseConfiguration
    Person studentToPerson(Student student);
}
