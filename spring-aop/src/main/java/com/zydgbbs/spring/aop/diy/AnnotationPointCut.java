package com.zydgbbs.spring.aop.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect//标注类是切面
public class AnnotationPointCut {

    @Pointcut("execution(* com.zydgbbs.spring.aop.service.UserService.*(..))")
    private void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("方法执行前...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("方法执行后...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp){
        System.out.println("环绕前...");
        //执行方法
        try {
            jp.proceed();
            System.out.println("方法的签名："+jp.getSignature());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后...");
    }

}
