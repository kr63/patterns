package decorator.example;

import decorator.example.decorators.*;

public class DecoratorExample {
    public static void main(String[] args) {
        String salaryRecords = "Name, Salary\nJohn Smith, 10000\nSteven Jobs, 91200";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("output.txt")));

        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource("output.txt");

        System.out.println("- Input ----------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------");
        System.out.println(encoded.readData());
    }
}
