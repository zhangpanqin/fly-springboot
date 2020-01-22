package com.fly.applicationcontextstudy;

import com.fly.applicationcontextstudy.AvoidScan;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2020-01-22-13:18
 * @description 自定义与 spring 重名的bean Environment
 */
@Component
@AvoidScan
public class Environment {
}
