package com.itheima.framework.beans;

/**
 * 用来封装bean标签属性
 * id属性
 * class属性
 * property子标签的数据
 */
public class BeanDefinition {

    private String id;
    private String className;

    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        this.propertyValues = new MutablePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutablePropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MutablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
