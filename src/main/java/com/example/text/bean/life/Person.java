/*
*  2019 
*/
package com.example.text.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author wangdan Date: 2019/3/14 Time: 10:47
 * @version $Id$
 */
public class Person implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public Person() {
        System.out.println("PersonService类构造方法  1");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法被调用  2 ");
    }

    //自定义的初始化函数
    public void myInit() {
        System.out.println("myInit被调用  7");
    }

    //自定义的销毁方法
    public void myDestroy() {
        System.out.println("myDestroy被调用  9");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("destory被调用  8");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("afterPropertiesSet被调用  6");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("setApplicationContext被调用  5");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("setBeanFactory被调用 4 ,beanFactory");
    }

    @Override
    public void setBeanName(String beanName) {
        // TODO Auto-generated method stub
        System.out.println("setBeanName被调用 3 ,beanName:" + beanName);
    }

    @Override
    public String toString() {
        return "name is :" + name;
    }
}