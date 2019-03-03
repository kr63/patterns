package command.example;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    private static List produceRequests() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    private static void workOffRequests(List queue) {
        for (Object command : queue) {
            ((Command) command).execute();
        }
    }

    public static void main(String[] args) {
        List queue = produceRequests();
        workOffRequests(queue);
    }
}
