/*
*  2019 
*/
package com.example.text.bean.bean1_8;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author wangdan Date: 2019/3/13 Time: 15:51
 * @version $Id$
 */
public class MyJavaBean implements InitializingBean {
    private String desc;
    private String remark;

    public MyJavaBean() {
        System.out.println("MyJavaBean的构造函数被执行啦");
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        System.out.println("调用setDesc方法");
        this.desc = desc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        System.out.println("调用setRemark方法");
        this.remark = remark;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet方法");
        this.desc = "在初始化方法中修改之后的描述信息";
    }

    public void initMethod() {
        System.out.println("调用initMethod方法");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[描述：").append(desc);
        builder.append("， 备注：").append(remark).append("]");
        return builder.toString();
    }

}