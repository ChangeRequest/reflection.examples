package school.lemon.changerequest.java.reflection.example;

public class _06NewInstanceCreationWithoutNoArgsConstructor {

    private static class WithoutNoArgsConstructor {
        public WithoutNoArgsConstructor(String example) {
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<WithoutNoArgsConstructor> clazz = WithoutNoArgsConstructor.class;
        clazz.newInstance();
    }

}
