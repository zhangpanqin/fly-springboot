package com.fly.exception;

import org.junit.jupiter.api.Test;
import org.springframework.core.ResolvableType;

import java.util.ArrayList;


class ExceptionStudyApplicationTests {

    @Test
    void contextLoads() {
        ResolvableType resolvableType = ResolvableType.forClass(MyList.class);
        ResolvableType superType = resolvableType.getSuperType();
        ResolvableType resolvableType2 = ResolvableType.forClass(MyList2.class);
        ResolvableType superType1 = resolvableType2.getSuperType();
        System.out.println(superType.isAssignableFrom(superType1));
    }

}

class MyList extends ArrayList<String> {

}

class MyList2 extends ArrayList<Integer> {

}