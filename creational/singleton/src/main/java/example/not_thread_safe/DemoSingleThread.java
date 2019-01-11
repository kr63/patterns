package example.not_thread_safe;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused!");

        Singleton singleton = Singleton.getInstance("foo");
        Singleton anotherSingleton = Singleton.getInstance("bar");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
