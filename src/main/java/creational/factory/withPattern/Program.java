package creational.factory.withPattern;

import creational.factory.withPattern.developers.Developer;
import creational.factory.withPattern.factories.CppDeveloperFactory;
import creational.factory.withPattern.factories.DeveloperFactory;
import creational.factory.withPattern.factories.JavaDeveloperFactory;
import creational.factory.withPattern.factories.PhpDeveloperFactory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory javaDeveloperFactory = createDeveloperBySpecialty("java");
        Developer javaDeveloper = javaDeveloperFactory.createDeveloper();
        javaDeveloper.writeCode();

        DeveloperFactory cppDeveloperFactory = createDeveloperBySpecialty("c++");
        Developer cppDeveloper = cppDeveloperFactory.createDeveloper();
        cppDeveloper.writeCode();

        DeveloperFactory phpDeveloperFactory = createDeveloperBySpecialty("php");
        Developer phpDeveloper = phpDeveloperFactory.createDeveloper();
        phpDeveloper.writeCode();
    }

    private static DeveloperFactory createDeveloperBySpecialty(String specialty) {

        switch (specialty) {
            case "java":
                return new JavaDeveloperFactory();
            case "c++":
                return new CppDeveloperFactory();
            case "php":
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException(specialty);
        }
    }
}
