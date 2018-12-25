package creational.factory.withPattern.factories;

import creational.factory.withPattern.developers.Developer;
import creational.factory.withPattern.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
