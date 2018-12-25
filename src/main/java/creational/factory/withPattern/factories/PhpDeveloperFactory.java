package creational.factory.withPattern.factories;

import creational.factory.withPattern.developers.Developer;
import creational.factory.withPattern.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
