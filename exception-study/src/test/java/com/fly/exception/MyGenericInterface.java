package com.fly.exception;

public interface MyGenericInterface<T extends CharSequence, M extends Demo> {
   default void onApplicationEvent1(T event,M event3){
      System.out.println(event.charAt(1));
      System.out.println(event3.getName());
   }
}