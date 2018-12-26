package pattern.factories;

import pattern.developers.Developer;
import pattern.managers.Manager;
import pattern.testers.Tester;
import pattern.testers.ManualTester;
import pattern.developers.PhpDeveloper;
import pattern.managers.WebsitePM;

public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
