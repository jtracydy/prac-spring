/*
*  2019 
*/
package com.example.text.bean.static_factory;

/**
 * @author wangdan Date: 2019/2/27 Time: 20:38
 * @version $Id$
 */
public class Factory {

    public static final FactoryDao getStaticFactoryDao(){
        return new FactoryDao();
    }

    public FactoryService getFactoryService(){
        return new FactoryService();
    }
}