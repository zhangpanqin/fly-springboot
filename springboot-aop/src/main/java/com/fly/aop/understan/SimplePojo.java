package com.fly.aop.understan;

public class SimplePojo implements Pojo {

    @Override
    public void foo() {
        this.bar();
    }

    public void bar() {
        System.out.println(111);
    }
}