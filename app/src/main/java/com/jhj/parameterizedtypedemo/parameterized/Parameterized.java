package com.jhj.parameterizedtypedemo.parameterized;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Parameterized {


    public static <T> Type getType(AbsConvert<T> convert) {

        Type superClass = convert.getClass().getGenericSuperclass();
        if (superClass instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) superClass).getActualTypeArguments();
            return types[0];

        }
        return superClass;
    }
}
