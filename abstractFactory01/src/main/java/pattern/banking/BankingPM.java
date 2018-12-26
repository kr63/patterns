package pattern.banking;

import pattern.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banging project!");
    }
}
