package withPattern.factories;

import withPattern.developers.Developer;
import withPattern.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
