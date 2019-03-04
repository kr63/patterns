package mediator.example;

public class Producer implements Runnable {
    private static int num = 1;
    private Mediator med;
    private int id;

    Producer(Mediator m) {
        med = m;
        id = num++;
    }

    @Override
    public void run() {
        int num;
        while (true) {
            med.storeMessage(num = (int) (Math.random() * 100));
            System.out.print("p" + id + "-" + num + "  ");
        }
    }
}
