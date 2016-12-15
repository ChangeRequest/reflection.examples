package school.lemon.changerequest.java.reflection.example;

import java.lang.reflect.Constructor;

public class _09PrivateConstructor {

    private static class WithPrivateConstructor {
        private WithPrivateConstructor(String string) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) throws ReflectiveOperationException {
        Class<WithPrivateConstructor> clazz = WithPrivateConstructor.class;

        Constructor<WithPrivateConstructor> privateConstructor = clazz.getDeclaredConstructor(String.class);
        privateConstructor.setAccessible(true);
        privateConstructor.newInstance("hello");
    }

}
