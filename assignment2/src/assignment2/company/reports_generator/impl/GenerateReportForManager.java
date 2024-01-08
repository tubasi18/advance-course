package assignment2.company.reports_generator.impl;

import assignment2.company.models.Manager;
import assignment2.company.models.User;
import assignment2.company.reports_generator.intf.IReportGenerator;

public class GenerateReportForManager implements IReportGenerator {
    public void generateReport(User manager) {
        Manager manager1 = (Manager)manager;
        for(User user : manager1.getStaffs()){
            System.out.println(user.toString());
        }
    }
}
