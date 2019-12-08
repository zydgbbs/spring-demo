package com.zydgbbs.spring.aop.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /**
     * @param o，返回值
     * @param method，方法
     * @param objects，参数
     * @param o1，目标对象
     * @throws Throwable
     */
    public void afterReturning(@Nullable Object o, Method method, Object[] objects, @Nullable Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+",返回结果为"+o);
    }
}
