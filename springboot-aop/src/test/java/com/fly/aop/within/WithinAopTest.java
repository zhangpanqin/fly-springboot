package com.fly.aop.within;

import com.fly.aop.aop.pointcut.within.bean.Parent;
import com.fly.aop.aop.pointcut.within.bean.Son;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 张攀钦
 * @date 2019-09-01-15:24
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class WithinAopTest   {

    @Autowired
    private Parent parent;

    @Autowired
    private Son son;
    
    @Test
    public void test1(){
        parent.log();
    }
    @Test
    public void log2(){
        son.log("ceshi-name");
    }
    @Test
    public void log3(){
        son.log(11);
    }
}
