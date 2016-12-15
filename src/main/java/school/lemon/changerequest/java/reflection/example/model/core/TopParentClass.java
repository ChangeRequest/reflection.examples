package school.lemon.changerequest.java.reflection.example.model.core;

public class TopParentClass implements TopParentClassInterface {

    public String topParentPublicField = "topParentPublicFieldValue";
    protected String topParentProtectedField = "topParentProtectedFieldValue";
    String topParentDefaultField = "topParentDefaultFieldValue";
    private String topParentPrivateField = "topParentPrivateFieldValue";

    public TopParentClass() {
        System.out.println("TopParentClass no-args constructor");
    }

    public TopParentClass(String string) {
        System.out.println("TopParentClass string constructor");
    }

    public void topParentPublicMethod() {
        System.out.println("topParentPublicMethod call");
    }

    protected void topParentProtectedMethod() {
        System.out.println("topParentProtectedMethod call");
    }

    void topParentDefaultMethod() {
        System.out.println("topParentDefaultMethod call");
    }

    private void topParentPrivateMethod() {
        System.out.println("topParentPrivateMethod call");
    }

}
