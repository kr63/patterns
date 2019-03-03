package command.example;

public class DomesticEngineer implements Command {
    @Override
    public void execute() {
        System.out.println("Take out the trash");
    }
}
