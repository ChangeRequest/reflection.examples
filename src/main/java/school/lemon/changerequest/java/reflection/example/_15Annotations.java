package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.annotations.AnnotationExample;
import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class _15Annotations {

    public static void main(String[] args) throws ReflectiveOperationException {
        Class<TestClass> clazz = TestClass.class;
        if (clazz.isAnnotationPresent(AnnotationExample.class)) {
            printAnnotation(clazz.getAnnotation(AnnotationExample.class));
        }
        System.out.println();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(AnnotationExample.class)) {
                System.out.println(method.getName());
                printAnnotation(method.getAnnotation(AnnotationExample.class));
            }
        }
        System.out.println();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(AnnotationExample.class)) {
                System.out.println(field.getName());
                printAnnotation(field.getAnnotation(AnnotationExample.class));
            }
        }
    }

    private static void printAnnotation(AnnotationExample annotation) {
        System.out.println(annotation.field() + " " + annotation.defaultField());
    }

}
