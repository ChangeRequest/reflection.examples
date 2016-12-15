package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.lang.reflect.Method;

public class _14DeclaredMethods {

    public static void main(String[] args) throws ReflectiveOperationException {
        Class<TestClass> clazz = TestClass.class;
        TestClass instance = new TestClass();
        System.out.println();

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
            method.setAccessible(true);
            method.invoke(instance, getParameters(method));
            System.out.println();
        }
    }

    private static Object[] getParameters(Method method) throws IllegalAccessException, InstantiationException {
        Object[] parameters = new Object[method.getParameterCount()];
        Class<?>[] types = method.getParameterTypes();
        for (int i = 0; i < types.length; ++i) {
            parameters[i] = types[i].newInstance();
        }
        return parameters;
    }

}
