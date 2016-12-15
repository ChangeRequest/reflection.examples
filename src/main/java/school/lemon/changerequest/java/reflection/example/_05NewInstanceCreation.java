package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

public class _05NewInstanceCreation {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<TestClass> clazz = TestClass.class;
        clazz.newInstance();
    }

}
