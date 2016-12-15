package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.lang.reflect.Constructor;

public class _08GetConstructor {

    public static void main(String[] args) throws ReflectiveOperationException {
        Class<TestClass> clazz = TestClass.class;

        Constructor<TestClass> noArgsConstructor = clazz.getConstructor();
        noArgsConstructor.newInstance();

        Constructor<TestClass> stringConstructor = clazz.getConstructor(String.class, String.class, String.class);
        stringConstructor.newInstance("hello", "world", "!");
    }

}
