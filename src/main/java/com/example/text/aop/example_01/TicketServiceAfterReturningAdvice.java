/*
*  2019 
*/
package com.example.text.aop.example_01;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 返回结果时后的处理意见
 */
public class TicketServiceAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("AFTER_RETURNING：本次服务已结束....");
    }
}