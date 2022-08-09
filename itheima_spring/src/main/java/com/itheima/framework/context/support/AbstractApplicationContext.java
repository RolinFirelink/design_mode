package com.itheima.framework.context.support;

import com.itheima.framework.beans.BeanDefinition;
import com.itheima.framework.beans.factory.support.BeanDefinitionReader;
import com.itheima.framework.beans.factory.support.BeanDefinitionRegistry;
import com.itheima.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * AbstractApplicationContext接口的子实现类，用于立即加载
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定义用于存储bean对象的map容器
    protected Map<String,Object> singletonObjects = new HashMap<>();

    //声明配置文件路径的变量
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        //加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);

        //初始化bean
        finishBeanInitialization();
    }

    //bean的初始化
    protected void finishBeanInitialization() throws Exception {
        //获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        //获取BeanDefinition对象
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);
            //初始化bean
            getBean(beanName);
        }
    }
}
