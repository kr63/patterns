package withPattern;

import withPattern.developers.Developer;
import withPattern.factories.CppDeveloperFactory;
import withPattern.factories.DeveloperFactory;
import withPattern.factories.JavaDeveloperFactory;
import withPattern.factories.PhpDeveloperFactory;

public class Factory {

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
