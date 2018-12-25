package withPattern.factories;

import withPattern.developers.Developer;
import withPattern.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
