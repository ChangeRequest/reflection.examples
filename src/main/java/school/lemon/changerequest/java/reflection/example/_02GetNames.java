package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

public class _02GetNames {

    public static void main(String[] args) {
        Class clazz = TestClass.class;

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
    }

}
