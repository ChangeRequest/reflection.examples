package school.lemon.changerequest.java.reflection.example.model.core;

public class ParentClass extends TopParentClass implements ParentClassInterface {

    public String parentPublicField = "parentPublicFieldValue";
    protected String parentProtectedField = "parentProtectedFieldValue";
    String parentDefaultField = "parentDefaultFieldValue";
    private String parentPrivateField = "parentPrivateFieldValue";

    public ParentClass() {
        System.out.println("ParentClass no-args constructor");
    }

    public ParentClass(String string1, String string2) {
        System.out.println("ParentClass string1, string2 constructor");
    }

    public void parentPublicMethod() {
        System.out.println("parentPublicMethod call");
    }

    protected void parentProtectedMethod() {
        System.out.println("parentProtectedMethod call");
    }

    void parentDefaultMethod() {
        System.out.println("parentDefaultMethod call");
    }

    private void parentPrivateMethod() {
        System.out.println("parentPrivateMethod call");
    }

}
