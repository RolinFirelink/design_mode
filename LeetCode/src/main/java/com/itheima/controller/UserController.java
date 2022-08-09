package com.itheima.controller;

import com.itheima.framework.context.ApplicationContext;
import com.itheima.framework.context.support.ClassPathXmlApplicationContext;
import com.itheima.service.UserService;

public class UserController {
    public static void main(String[] args) throws Exception{
        //1.创建spring的容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器对象中获取userService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        //3.调用userService进行业务逻辑处理
        userService.add();
    }
}
