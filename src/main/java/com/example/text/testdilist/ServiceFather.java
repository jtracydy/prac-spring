/*
*  2019 
*/
package com.example.text.testdilist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangdan Date: 2019/3/12 Time: 16:46
 * @version $Id$
 */
@Component
public class ServiceFather {

    @Autowired
    private List<Father> fathers;

    public void out(){
        System.out.println(fathers);
    }
}