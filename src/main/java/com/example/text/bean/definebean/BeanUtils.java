/*
*  2019 
*/
package com.example.text.bean.definebean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wangdan Date: 2019/3/9 Time: 10:40
 * @version $Id$
 */
@Component
public class BeanUtils implements ApplicationContextAware{

    private  ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getContext(){
        return applicationContext;
    }
}