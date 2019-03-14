/*
*  2019 
*/
package com.example.text.aop.own;

/**
 * @author wangdan Date: 2019/3/14 Time: 16:03
 * @version $Id$
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyInterceptor {

    @Pointcut("execution(* com.example.text.aop.own.*.*(..))")
    private void anyMethod(){
        System.out.println("......");
    }

    @Before("anyMethod()")
    public void doAccessCheck() {
        System.out.println("前置通知");
    }

    @After("anyMethod()")
    public void after() {
        System.out.println("最终结果");
    }

    @AfterReturning("anyMethod()")
    public void doAfter() {
        System.out.println("后置通知");
    }

    @AfterThrowing("anyMethod()")
    public void doAfterThrow() {
        System.out.println("例外通知");
    }

    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入环绕通知");
        Object object = pjp.proceed();
        System.out.println("退出方法");
        return object;
    }
    // 顺序: before->method->after->afterReturning
}