package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

import java.util.Arrays;

public class _10AllConstructors {

    public static void main(String[] args) {
        Class<TestClass> clazz = TestClass.class;

        System.out.println(Arrays.toString(clazz.getConstructors()));
        System.out.println(Arrays.toString(clazz.getDeclaredConstructors()));
    }

}
