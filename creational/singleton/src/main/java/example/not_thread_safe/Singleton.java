package example.not_thread_safe;

final class Singleton {

    private static Singleton instance;
    String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        this.value = value;
    }

    static Singleton getInstance(String value) {
        if (instance == null) {
            return new Singleton(value);
        }
        return instance;
    }
}
