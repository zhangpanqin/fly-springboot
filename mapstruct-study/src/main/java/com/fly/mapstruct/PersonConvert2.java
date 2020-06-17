package com.fly.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author 张攀钦
 * @date 2020-03-31-17:23
 */
@Mapper(uses = TimeConvert2.class)
public interface PersonConvert2 {
    PersonConvert2 PERSON_CONVERT = Mappers.getMapper(PersonConvert2.class);

    @Mapping(target = "studentName", source = "name")
    @Mapping(target = "birthday", source = "birthday", qualifiedBy = TimeConvert2.StringToTime.class)
    Student personToStudent(Person person);

    @Mapping(target = "name", source = "studentName")
    @Mapping(target = "birthday", source = "birthday", qualifiedBy = TimeConvert2.TimeToString.class)
    Person studentToPerson(Student student);
}
