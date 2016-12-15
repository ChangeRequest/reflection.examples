package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.lang.reflect.Field;

public class _11Fields {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<TestClass> clazz = TestClass.class;

        for (Field field : clazz.getFields()) {
            System.out.println(field.getName());
        }
        System.out.println();

        TestClass testClass = new TestClass();
        System.out.println();

        Field publicField = clazz.getField("publicField");
        Field parentPublicField = clazz.getField("parentPublicField");
        Field topParentPublicField = clazz.getField("topParentPublicField");

        System.out.println(publicField.get(testClass));
        System.out.println(parentPublicField.get(testClass));
        System.out.println(topParentPublicField.get(testClass));
        System.out.println();

        publicField.set(testClass, "modifiedPublicField");
        parentPublicField.set(testClass, "modifiedParentPublicField");
        topParentPublicField.set(testClass, "modifiedTopParentPublicField");

        System.out.println(publicField.get(testClass));
        System.out.println(parentPublicField.get(testClass));
        System.out.println(topParentPublicField.get(testClass));
        System.out.println();

        System.out.println(testClass.publicField);
        System.out.println(testClass.parentPublicField);
        System.out.println(testClass.topParentPublicField);
    }

}
