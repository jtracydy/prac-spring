/*
*  2019 
*/
package com.example.text.aop.example;

import com.example.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangdan Date: 2019/3/14 Time: 09:30
 * @version $Id$
 */
public class TestA extends BaseTest {

    @Autowired
    private BServiceImpl bService;

    @Test
    public void testApect() {
        bService.barB("testm",2);
    }
}