package com.itheima.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 用户存储和管理多个PropertyValue对象
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{

    //定义List集合对象，用来存储PropertyValue对象
    private final List<PropertyValue> propertyValuesList;

    public MutablePropertyValues() {
        this.propertyValuesList=new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValuesList) {
        if(propertyValuesList==null){
            this.propertyValuesList=new ArrayList<>();
        }else {
            this.propertyValuesList=propertyValuesList;
        }
    }

    //获取所有的PropertyValue对象，返回以数组的形式
    public PropertyValue[] getPropertyValues() {
        //将集合转换为数组并返回
        return propertyValuesList.toArray(new PropertyValue[0]);
    }

    //根据name属性值获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        //遍历集合对象
        for (PropertyValue propertyValue : propertyValuesList) {
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }

    //判断集合是否为空
    public boolean isEmpty() {
        return propertyValuesList.isEmpty();
    }

    //添加PropertyValue对象
    public MutablePropertyValues addPropertyValue(PropertyValue pv) {
        //判断集合中存储的PropertyValue对象是否和传递进来的重复了，如果重复则进行覆盖
        for (int i = 0; i < propertyValuesList.size(); i++) {
            //获取集合中每一个PropertyValue对象
            PropertyValue propertyValue = propertyValuesList.get(i);
            if(propertyValue.getName().equals(pv.getName())){
                propertyValuesList.set(i,pv);
                return this;//返回原来的对象目的就是为了实现链式编程
            }
        }
        propertyValuesList.add(pv);
        return this;//返回原来的对象目的就是为了实现链式编程
    }

    //判断是否有指定name属性值的对象
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }

    //获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValuesList.iterator();
    }
}
