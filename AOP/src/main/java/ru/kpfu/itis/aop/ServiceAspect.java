package ru.kpfu.itis.aop;


import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.Date;

public class ServiceAspect {

    public void before() {
        System.out.println("");
    }

    public Object timeLog(ProceedingJoinPoint joinPoint) throws Throwable {
        Date start = new Date(System.currentTimeMillis());
        System.out.println("Start invoking "
                + joinPoint.getTarget().getClass().getSimpleName()
                + "."
                + joinPoint.getSignature().getName()
                + " with params "
                + Arrays.toString(joinPoint.getArgs())
                + "\n start: " + start);
        Object result = joinPoint.proceed();
        Date end = new Date(System.currentTimeMillis());
        System.out.println("end: " + end + "\n duration: " + (end.getTime() - start.getTime()) + " ms");
        return result;
    }

    public Object excLog(ProceedingJoinPoint joinPoint) {
        try {
            Object obj = joinPoint.proceed();
            return obj;
        } catch (Throwable throwable) {
            System.out.println("[Exception]: " + throwable.toString() + "in" + joinPoint.getSignature().getName() + " catched for arguments: " + Arrays.toString(joinPoint.getArgs()));
            return null;
        }
    }


}
