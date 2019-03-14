/*
*  2019 
*/
package com.example.text.aop.own;

/**
 * @author wangdan Date: 2019/3/14 Time: 16:07
 * @version $Id$
 */

import com.example.BaseTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest extends BaseTest {

    @Test
    public void testAop() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dispatcher-servlet.xml");
        PersonServerBean bean = (PersonServerBean) ctx.getBean("personServerBean");
        bean.save("test");
    }
}