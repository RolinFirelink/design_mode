package com.itheima.framework.context;

import com.itheima.framework.beans.factory.BeanFactory;

/**
 * 定义非延时加载功能
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
