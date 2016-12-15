package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.util.Arrays;

import static java.lang.String.format;

public class _04GetInterfaces {

    public static void main(String[] args) {
        Class clazz = TestClass.class;

        while (!clazz.equals(Object.class)) {
            Class[] interfaces = clazz.getInterfaces();
            System.out.println(format("Class %s implements %s", clazz.getSimpleName(), Arrays.toString(interfaces)));
            clazz = clazz.getSuperclass();
        }
    }

}
