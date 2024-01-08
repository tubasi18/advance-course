package assignment2.company.reports_generator.impl;

import assignment2.company.models.Director;
import assignment2.company.models.User;
import assignment2.company.reports_generator.intf.IReportGenerator;

public class GenerateReportForDirector implements IReportGenerator {

    public void generateReport(User director) {
        Director director1 = (Director)director;
        for(User user : director1.getManagers()){
            System.out.println(user.toString());
        }
        for(User user : director1.getStaffs()){
            System.out.println(user.toString());
        }
    }
}
