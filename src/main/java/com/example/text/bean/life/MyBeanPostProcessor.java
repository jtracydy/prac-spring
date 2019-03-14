/*
*  2019 
*/
package com.example.text.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author wangdan Date: 2019/3/14 Time: 10:48
 * @version $Id$
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        // TODO Auto-generated method stub

        System.out.println("Initialization被调用 Before"+" --> " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("Initialization被调用 After"+" --> " + beanName);
        return bean;
    }

}