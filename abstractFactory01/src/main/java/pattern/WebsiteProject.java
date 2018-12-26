package pattern;

import pattern.website.WebsiteTeamFactory;

public class WebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
        Developer developer = websiteTeamFactory.getDeveloper();
        Tester tester = websiteTeamFactory.getTester();
        ProjectManager projectManager = websiteTeamFactory.getProjectManager();

        System.out.println("Create auction web site");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
