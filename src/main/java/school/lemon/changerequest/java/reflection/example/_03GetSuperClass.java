package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import static java.lang.String.format;

public class _03GetSuperClass {

    public static void main(String[] args) {
        Class clazz = TestClass.class;

        while (!clazz.equals(Object.class)) {
            Class superClazz = clazz.getSuperclass();
            System.out.println(format("Parent for class %s is %s", clazz.getSimpleName(), superClazz.getSimpleName()));
            clazz = superClazz;
        }
    }

}
