/*
*  2019 
*/
package com.example.text.testdilist;

import org.springframework.stereotype.Service;

/**
 * @author wangdan Date: 2019/3/12 Time: 16:45
 * @version $Id$
 */

@Service
public class Son2 implements Father {
    @Override
    public void name() {
        System.out.println("son2.......");
    }
}