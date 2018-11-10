package com.jhj.parameterizedtypedemo.parameterized;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class AbsParameterized<T> {

    public Type getType() {

        Type superClazz = getClass().getGenericSuperclass();

        if (superClazz instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) superClazz).getActualTypeArguments();
            return types[0];
        } else {
            return superClazz;
        }

    }

}
