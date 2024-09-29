package app;

public class StudentApp {
    public static void main(String[] args) {
        SingletonClass studApp = SingletonClass.getInstance();
        studApp.run();
    }
}
