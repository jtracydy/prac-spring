/*
*  2019 
*/
package com.example;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangdan Date: 2019/2/27 Time: 20:11
 * @version $Id$
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:dispatcher-servlet.xml"})
public class BaseTest {
}