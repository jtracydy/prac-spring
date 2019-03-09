/*
*  2019 
*/
package com.example.text.bean.definebean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wangdan Date: 2019/3/9 Time: 09:54
 * @version $Id$
 */

public class SpringPostInit {


    @PostConstruct
    public void init(){
        System.out.println("post construct....");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("PreDestroy........");
    }
}