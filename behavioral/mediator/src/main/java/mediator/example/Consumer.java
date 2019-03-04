package mediator.example;

public class Consumer implements Runnable {

    private static int num = 1;
    private Mediator med;
    private int id;

    Consumer(Mediator m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print("c" + id + "-" + med.retrieveMessage() + "  ");
        }
    }
}
