package pattern.website;

import pattern.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages pattern.website project");
    }
}
