package com.tavi;

import org.apache.commons.collections.MapUtils;
import org.codehaus.jackson.map.ObjectMapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Tavi on 11/11/2015.
 */
public class MapperMagician {
    public <T> Map<String,String> map(T t) {
        return this.mapUsingJackson(t);

        /*
        try {
            return this.mapUsingReflection(t);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
        */
    }

    public <T> Map<String,String> mapUsingJackson(T t) {
        ObjectMapper m = new ObjectMapper();
        Map<String,String> props = m.convertValue(t, Map.class);

        return props;
    }

    public Map<String, String> mapUsingReflection(Object obj) throws
            IllegalAccessException,
            IllegalArgumentException,
            InvocationTargetException {
        Class<?> pomclass = obj.getClass();
        pomclass = obj.getClass();
        Method[] methods = obj.getClass().getMethods();


        Map<String, String> map = new HashMap<String, String>();
        for (Method m : methods) {
            if (m.getName().startsWith("get") && !m.getName().startsWith("getClass")) {
                Object value = (Object) m.invoke(obj);
                map.put(m.getName().substring(3), value.toString());
            }
        }
        return map;
    }

    public void mapUsingLambda(FooFooObject foofoo) {
        foofoo.getThelist().stream().filter(
                p -> p.attr1 != null
                        && p.attr2 != null)
                .map(p -> p.attr1)
                .forEach(attr1 -> System.out.println(attr1))
        ;
    }

    public static void main(String [] args) {
        System.out.println("This is the beginning of it all.");

        MapperMagician mapper = new MapperMagician();
        //Map<String,String> mmm = mapper.map(new FooFooObject());
        mapper.mapUsingLambda(new FooFooObject());

        /*System.out.println("Conversion result: ");
        MapUtils.debugPrint(System.out, "myMap", mmm);*/
    }

}
