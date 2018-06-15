package com.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {

    /**
     * BiPredicateExample works fine.
     */
//    @Pointcut("execution(* com.empty.*.*(..) )")

    /**
     *  It'll raise NullPointException When this PointCut cut
     *  into the FunctionalInterface.
     */
    @Pointcut("execution(* com.test.*.*(..) )")
    public void logPointCut(){}

    @Before("logPointCut()")
    public void printBeforeMethodInvoke(JoinPoint joinPoint){

    }


}
