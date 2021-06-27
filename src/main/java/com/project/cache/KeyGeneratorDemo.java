package com.project.cache;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
* Description:
* date: 2021/6/6 10:34
* @author: zzsanshi
* @since JDK 14
*/

public class KeyGeneratorDemo implements KeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... params) {
        //规定  本类名+方法名+参数名 为key
        StringBuilder sb = new StringBuilder();
        sb.append(o.getClass().getName());
        sb.append("-");
        sb.append(method.getName());

//        for (Object param : params) {
//            sb.append(param.toString());
//        }
        return sb.toString();
    }
}
