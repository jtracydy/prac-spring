/*
*  2019 
*/
package com.example.text.bean.bean1_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * BeanFactoryPostProcessor
 * @author wangdan Date: 2019/3/13 Time: 15:55
 * @version $Id$
 */
public class PostProcessorMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:dispatcher-servlet.xml");
        MyJavaBean bean = (MyJavaBean) context.getBean("myJavaBean");
        System.out.println("===============下面输出结果============");
        System.out.println("描述：" + bean.getDesc());
        System.out.println("备注：" + bean.getRemark());

    }
}