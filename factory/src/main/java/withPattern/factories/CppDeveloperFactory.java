package withPattern.factories;

import withPattern.developers.CppDeveloper;
import withPattern.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
