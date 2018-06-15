package com.test;

import org.springframework.stereotype.Component;

import java.util.function.BiPredicate;


@Component
public class BiPredicateExample {

    public BiPredicate<Integer,Integer> cmp = (x,y) -> (x>y);

    public boolean cmp1(Integer x, Integer y){
        return x>y;
    }
}
