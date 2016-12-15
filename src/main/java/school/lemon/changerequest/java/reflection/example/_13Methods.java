package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.lang.reflect.Method;

public class _13Methods {

    public static void main(String[] args) throws ReflectiveOperationException {
        Class<TestClass> clazz = TestClass.class;

        for (Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }

        TestClass instance = new TestClass();
        System.out.println();

        Method publicMethodWithArgs = clazz.getMethod("publicMethodWithArgs", String.class);
        publicMethodWithArgs.invoke(instance, "Hello World!");

        Method topParentPublicMethod = clazz.getMethod("topParentPublicMethod");
        topParentPublicMethod.invoke(instance);
    }

}
