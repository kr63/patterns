package example.thread_safe;

final class Singleton {
    private static volatile Singleton instance;
    String value;

    private Singleton(String value) {
        this.value = value;
    }

    static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
}
