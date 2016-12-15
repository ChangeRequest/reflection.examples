package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.lang.reflect.Field;

public class _12DeclaredFields {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<TestClass> clazz = TestClass.class;
        Field[] declaredFields = clazz.getDeclaredFields();

        TestClass testClass = new TestClass();
        System.out.println();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println(field.get(testClass));

            field.set(testClass, field.get(testClass) + "Modified");
            System.out.println(field.get(testClass));
            System.out.println();
        }

    }

}
