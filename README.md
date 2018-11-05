# ParameterizedTypeDemo

``` java
/**
 * 参数化类型，即泛型
 */
public interface ParameterizedType extends Type{
    //获取<>中的实际类型
    Type[] getActualTypeArguments();
    //获取<>前面的实际类型
    Type getRawType();
    //如果这个类型是某个类型所属，获得这个所有者类型，没有返回null
    Type getOwnerType();
    
}

```
