package creational.factory.withPattern.factories;

import creational.factory.withPattern.developers.CppDeveloper;
import creational.factory.withPattern.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
