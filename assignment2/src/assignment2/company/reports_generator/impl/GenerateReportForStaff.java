package assignment2.company.reports_generator.impl;

import assignment2.company.models.User;
import assignment2.company.reports_generator.intf.IReportGenerator;

public class GenerateReportForStaff implements IReportGenerator {
    public void generateReport(User staff) {
        System.out.println(staff.toString());
    }
}
