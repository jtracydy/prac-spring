/*
*  2019 
*/
package com.example.text.aop.own;

/**
 * @author wangdan Date: 2019/3/14 Time: 16:03
 * @version $Id$
 */

public class PersonServerBean {

    public void save(String name) {
        System.out.println("save方法");
    }

    public void update(String name, Integer id) {
        System.out.println("update方法");
    }

    public String getPersonName(Integer id) {
        System.out.println("getPersonName方法");
        return "myName";
    }
}