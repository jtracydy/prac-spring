/*
*  2019 
*/
package com.example.text.aop.example;

/**
 * @author wangdan Date: 2019/3/13 Time: 19:17
 * @version $Id$
 */
// 使用cglib
public class BServiceImpl {

    public void barB(String _msg, int _type) {
        System.out.println("BServiceImpl.barB(msg:" + _msg + " type:" + _type + ")");
        if (_type == 1){
            throw new IllegalArgumentException("测试异常");
        }
    }

    public void fooB() {
        System.out.println("BServiceImpl.fooB()");
    }

}