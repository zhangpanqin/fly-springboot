package com.fly.exception;

import org.junit.jupiter.api.Test;
import org.springframework.core.ResolvableType;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public class ExceptionStudyApplicationTests {


    @Test
    public void contextLoads() {
        ResolvableType resolvableType = ResolvableType.forClass(MyList33.class);
        final ResolvableType[] interfaces = resolvableType.getInterfaces();
        ResolvableType resolvableType2 = ResolvableType.forClass(MyList2.class);
        final ResolvableType[] interfaces1 = resolvableType2.getInterfaces();
        System.out.println(interfaces[0].isAssignableFrom(interfaces1[0]));
    }

    @Test
    public void run22() {
        ResolvableType resolvableType = ResolvableType.forClass(MyList2.class);
        final ResolvableType[] interfaces = resolvableType.getInterfaces();
        final ResolvableType[] generics = interfaces[0].getGenerics();
        /**
         * class java.lang.String
         * class com.fly.exception.Demo
         */

        for (ResolvableType generic : generics) {
            System.out.println(generic.resolve());
        }
    }

    @Test
    public void run33() {
        ResolvableType resolvableType = ResolvableType.forClass(MyList33.class);
        final ResolvableType[] interfaces = resolvableType.getInterfaces();
        final ResolvableType[] generics = interfaces[0].getGenerics();
        /**
         * class java.lang.String
         * class com.fly.exception.Demo2
         */
        for (ResolvableType generic : generics) {
            System.out.println(generic.resolve());
        }
    }

    @Test
    public void run32() {
        ResolvableType resolvableType = ResolvableType.forClass(MyList33.class);
        final ResolvableType[] interfaces = resolvableType.getInterfaces();
        final Class<?>[] classes = interfaces[0].resolveGenerics();
        /**
         * class java.lang.String
         * class com.fly.exception.Demo2
         */
        for (Class generic : classes) {
            System.out.println(generic.getName());
        }
    }


    @Test
    public void run44() {
        final MyList33 myList33 = new MyList33();
        final ResolvableType resolvableType = ResolvableType.forInstance(myList33);
        /**
         * class com.fly.exception.MyList33
         */
        System.out.println(resolvableType.resolve());
        final ResolvableType[] interfaces = resolvableType.getInterfaces();
        for (ResolvableType anInterface : interfaces) {
            final ResolvableType[] generics = anInterface.getGenerics();
            /**
             * class java.lang.String
             * class com.fly.exception.Demo2
             */
            for (ResolvableType generic : generics) {
                System.out.println(generic.resolve());
            }
        }
    }

    @Test
    public void run55() {
        MyList44<String, Demo> objectObjectMyList44 = new MyList44<>();
        final ResolvableType resolvableType = ResolvableType.forInstance(objectObjectMyList44);
        for (ResolvableType generic : resolvableType.getGenerics()) {
            System.out.println(generic.resolve());
        }
    }

    @Test
    public void run66() {
        final ResolvableType resolvableType = ResolvableType.forClass(MyList44.class);
        for (ResolvableType generic : resolvableType.getGenerics()) {
            System.out.println(generic.resolve());
        }
    }

    @Test
    public void run77() {
        final MyList55<String, Demo2> stringDemo2MyList55 = new MyList55<>();
        final ResolvableType resolvableType = ResolvableType.forInstance(stringDemo2MyList55);
        // null
        // null
        for (ResolvableType generic : resolvableType.getGenerics()) {
            System.out.println(generic.resolve());
        }
    }

    @Test
    public void run88() {
        final MyList33 obj = new MyList33();
        final Class<? extends MyList33> aClass = obj.getClass();
        final Type[] genericInterfaces = aClass.getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            System.out.println(genericInterface instanceof ParameterizedType);
            ParameterizedType t = (ParameterizedType) genericInterface;
            System.out.println(genericInterface.getTypeName());
        }
    }

}