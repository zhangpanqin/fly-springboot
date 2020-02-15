package com.fly.applicationcontextstudy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangpanqin
 */
@ComponentScan(excludeFilters = {@ComponentScan.Filter(classes = {AvoidScan.class})})
@SpringBootApplication
public class ApplicationContextStudyApplication {

    public static void main(String[] args) {
        MySpringApplication application=new MySpringApplication(new Class<?>[] { ApplicationContextStudyApplication.class  });
        application.run(args);
    }

}
