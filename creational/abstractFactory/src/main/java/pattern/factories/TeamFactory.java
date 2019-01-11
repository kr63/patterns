package pattern.factories;

import pattern.developers.Developer;
import pattern.managers.Manager;
import pattern.testers.Tester;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
