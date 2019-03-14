/*
*  2019 
*/
package com.example.text.aop.example;

/**
 * @author wangdan Date: 2019/3/13 Time: 19:16
 * @version $Id$
 */

// 使用jdk动态代理
public class AServiceImpl implements AService {

    @Override
    public void barA() {
        System.out.println("AServiceImpl.barA()");
    }

    @Override
    public void fooA(String _msg) {
        System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");
    }
}