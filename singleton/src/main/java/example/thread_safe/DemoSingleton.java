package example.thread_safe;

public class DemoSingleton {
    public static void main(String[] args) {
        System.out.println("If you see the same values, then singleton was reused");
        System.out.println("If you see different values, then 2 singletons were created");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    private static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("foo");
            System.out.println(singleton.value);
        }
    }

    private static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("bar");
            System.out.println(singleton.value);
        }
    }
}
