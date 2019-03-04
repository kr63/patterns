package mediator.example;

class Mediator {
    // 4. The Mediator arbitrates
    private boolean slotFull = false;
    private int number;

    synchronized void storeMessage(int num) {
        // no room for another message
        while (slotFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = true;
        number = num;
        notifyAll();
    }

    synchronized int retrieveMessage() {
        // no message to retrieve
        while (!slotFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = false;
        notifyAll();
        return number;
    }
}
