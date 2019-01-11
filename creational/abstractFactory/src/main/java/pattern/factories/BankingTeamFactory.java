package pattern.factories;

import pattern.developers.Developer;
import pattern.managers.Manager;
import pattern.managers.BankingPM;
import pattern.developers.JavaDeveloper;
import pattern.testers.QATester;
import pattern.testers.Tester;

public class BankingTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
