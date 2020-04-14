package com.fly.mapstruct;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

/**
 * @author 张攀钦
 * @date 2020-03-31-17:30
 */
public class MainTest {
    @Test
    public void test1() {
        final Person person = new Person();
        person.setAge(12);
        person.setBirthday("2020-11-11 00:00:00");
        person.setName("名称");
        final Student student = PersonConvert.PERSON_CONVERT.personToStudent(person);
        System.out.println(student);
    }

    @Test
    public void test2(){
        final Student student = new Student();
        student.setAge(123);
        student.setBirthday(LocalDateTime.now());
        student.setStudentName("学生");
        final Person person = PersonConvert.PERSON_CONVERT.studentToPerson(student);
        System.out.println(person);

    }
}
