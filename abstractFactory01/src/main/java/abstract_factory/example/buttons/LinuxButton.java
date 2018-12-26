package abstract_factory.example.buttons;

public class LinuxButton implements Button{
    @Override
    public void paint() {
        System.out.println("You created LinuxButton");
    }
}
