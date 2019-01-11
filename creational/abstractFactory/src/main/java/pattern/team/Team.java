package pattern.team;

import pattern.developers.Developer;
import pattern.factories.TeamFactory;
import pattern.managers.Manager;
import pattern.testers.Tester;

public class Team {

    private Manager manager;
    private Developer developer;
    private Tester tester;

    public Team(TeamFactory teamFactory) {
        manager = teamFactory.getManager();
        developer = teamFactory.getDeveloper();
        tester = teamFactory.getTester();
    }

    public void workOnProject(){
        manager.manageProject();
        developer.writeCode();
        tester.testCode();
    }
}
