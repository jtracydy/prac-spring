/*
*  2019 
*/
package com.example.text.bean;

import com.example.BaseTest;
import org.junit.Test;
        import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangdan Date: 2019/2/27 Time: 20:15
 * @version $Id$
 */
public class TestDemo extends BaseTest{

    @Autowired
    private ClientController clientController;

    @Test
    public void test(){
        clientController.testSet();
        clientController.testCon();

        clientController.testStaticFactory();
        clientController.testFactoryService();
    }
}