package school.lemon.changerequest.java.reflection.example;

import school.lemon.changerequest.java.reflection.example.model.core.TestClass;

public class _01GetClass {

    public static void main(String[] args) throws ClassNotFoundException {
        TestClass testClass = new TestClass();
        Class classByMethod = testClass.getClass();
        Class classByType = TestClass.class;
        Class classByName = Class.forName("school.lemon.changerequest.java.reflection.example.model.core.TestClass");

        System.out.println((classByMethod == classByType) == (classByType == classByName));
    }

}
