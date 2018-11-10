package com.jhj.parameterizedtypedemo.parameterized;

import android.support.annotation.NonNull;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ParameterizedTypeImpl implements ParameterizedType {

    private final Class<?> raw;
    private final Type[] types;

    public ParameterizedTypeImpl(Class<?> raw, Type... types) {
        this.raw = raw;
        this.types = types;
    }

    public Type getType() {
        return this;
    }

    /**
     * 获取<>中的实际类型
     *
     * @return Type
     */
    @NonNull
    @Override
    public Type[] getActualTypeArguments() {
        return types;
    }

    /**
     * 获取<>前面的实际类型
     *
     * @return Type
     */
    @NonNull
    @Override
    public Type getRawType() {
        return raw;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }


}
