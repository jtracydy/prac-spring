/*
*  2019 
*/
package com.example.text.bean.definebean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author wangdan Date: 2019/3/14 Time: 10:30
 * @version $Id$
 */
public class BeanAwareFactory implements BeanFactoryAware {

    private BeanFactory bf;

    /**
     * 重写setBeanFactory方法
     *
     * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.springframework.beans.factory.BeanFactory)
     */
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        this.bf = arg0;

    }

    public BeanFactory getBf() {
        return bf;
    }

}