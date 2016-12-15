package school.lemon.changerequest.java.reflection.example;

public class _07NewInstanceCreationWithPrivateNoArgsConstructor {

    private static class WithPrivateNoArgsConstructor {
        private WithPrivateNoArgsConstructor() {
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<WithPrivateNoArgsConstructor> clazz = WithPrivateNoArgsConstructor.class;
        clazz.newInstance();
    }

}
