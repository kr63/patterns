package pattern;

import pattern.banking.BankingTeamFactory;

public class BankingProject {
    public static void main(String[] args) {
        ProjectTeamFactory bankingTeamFactory = new BankingTeamFactory();
        Developer developer = bankingTeamFactory.getDeveloper();
        Tester tester = bankingTeamFactory.getTester();
        ProjectManager projectManager = bankingTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
