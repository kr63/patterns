package command.example;

public class Programmer implements Command {
    @Override
    public void execute() {
        System.out.println("Find the bugs!");
    }
}
