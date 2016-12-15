package school.lemon.changerequest.java.reflection.example.model.core;

import school.lemon.changerequest.java.reflection.example.model.annotations.AnnotationExample;

@AnnotationExample(field = "Hello")
public class TestClass extends ParentClass implements TestClassInterface {

    @AnnotationExample(field = "Hello", defaultField = "World!")
    public String publicField = "publicFieldValue";
    protected String protectedField = "protectedFieldValue";
    String defaultField = "defaultFieldValue";
    private String privateField = "privateFieldValue";

    public TestClass() {
        System.out.println("TestClass no-args constructor");
    }

    private TestClass(String string1) {
        System.out.println("TestClass string1 constructor");
    }

    public TestClass(String string1, String string2, String string3) {
        System.out.println("TestClass string1, string2, string3 constructor");
    }

    public void publicMethodWithArgs(String arg) {
        System.out.println("publicMethodWithArgs call, args: " + arg);
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod call");
    }

    void defaultMethod() {
        System.out.println("defaultMethod call");
    }

    @AnnotationExample(field = "Hello", defaultField = "Private World!")
    private void privateMethod() {
        System.out.println("privateMethod call");
    }

}
