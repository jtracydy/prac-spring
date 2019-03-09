/*
*  2019 
*/
package com.example.text.bean.definebean;

import com.example.BaseTest;
import com.example.text.bean.ClientController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * @author wangdan Date: 2019/3/9 Time: 10:42
 * @version $Id$
 */
public class TestBeanUtils extends BaseTest {

    @Resource
    private BeanUtils beanUtils;

    @Test
    @Override
    public void test() {
        ApplicationContext applicationContext = beanUtils.getContext();
        ClientController clientController = (ClientController) applicationContext.getBean("clientController");
        clientController.out();
    }
}