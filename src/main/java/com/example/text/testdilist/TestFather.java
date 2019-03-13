/*
*  2019 
*/
package com.example.text.testdilist;

import com.example.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangdan Date: 2019/3/12 Time: 16:47
 * @version $Id$
 */
public class TestFather extends BaseTest{

    @Autowired
    private ServiceFather serviceFather;

    @Test
    public void testFather(){
        serviceFather.out();
    }
}