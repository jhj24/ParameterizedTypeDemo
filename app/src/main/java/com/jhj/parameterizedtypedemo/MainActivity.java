package com.jhj.parameterizedtypedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jhj.parameterizedtypedemo.parameterized.AbsConvert;
import com.jhj.parameterizedtypedemo.parameterized.AbsParameterized;
import com.jhj.parameterizedtypedemo.parameterized.Parameterized;
import com.jhj.parameterizedtypedemo.parameterized.ParameterizedTypeImpl;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AbsParameterized<String> parameterizedType = new AbsParameterized<String>() {
        };
        parameterizedType.getType();


        Parameterized.getType(new AbsConvert<List<String>>() {
        });

        ParameterizedTypeImpl a = new ParameterizedTypeImpl(List.class, String.class);
        Type b = a.getType();
        Type c = b;

    }

}
