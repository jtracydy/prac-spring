/*
*  2019 
*/
package com.example.text.bean.divalue;

import com.example.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangdan Date: 2019/2/28 Time: 20:02
 * @version $Id$
 */
public class TestDataSource extends BaseTest{

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1(){
        System.out.println(dataSource.getValue());
    }
}