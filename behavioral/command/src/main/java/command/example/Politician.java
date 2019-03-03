package command.example;

public class Politician implements Command {
    @Override
    public void execute() {
        System.out.println("Take money from the rich");
    }
}
