package com.fly.applicationcontextstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.StaticApplicationContext;


/**
 * @author zhangpanqin
 * 自定义上下文
 */
public class MySpringApplication extends SpringApplication {

	public MySpringApplication(Class<?>[] classes){
		super(classes);
	}

	@Override
	protected ConfigurableApplicationContext createApplicationContext(){
		
		StaticApplicationContext parent=new StaticApplicationContext();
		parent.registerBean(Environment.class);
		parent.refresh();
		ConfigurableApplicationContext child=super.createApplicationContext();
		child.setParent(parent);

		return child;
	}	
}