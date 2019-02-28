/*
*  2019 
*/
package com.example.text.bean.divalue;


/**
 * @author wangdan Date: 2019/2/28 Time: 19:57
 * @version $Id$
 */

public class DataSource {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private String pwd;

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getValue() {
        return name + " " + pwd;
    }
}