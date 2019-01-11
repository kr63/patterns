package pattern;

import pattern.factories.BankingTeamFactory;
import pattern.factories.TeamFactory;
import pattern.factories.WebsiteTeamFactory;
import pattern.team.Team;

import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        Team websiteTeam  = createTeam("website");
        websiteTeam.workOnProject();

        Team bankTeam = createTeam("bank");
        bankTeam.workOnProject();

    }

    private static Team createTeam(String project) {
        TeamFactory teamFactory = null;
        switch (project) {
            case "website":
                teamFactory = new WebsiteTeamFactory();
                break;
            case "bank":
                teamFactory = new BankingTeamFactory();
                break;
        }
        return new Team(Objects.requireNonNull(teamFactory));
    }
}
