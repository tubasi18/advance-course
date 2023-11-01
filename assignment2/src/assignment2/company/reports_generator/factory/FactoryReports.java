package assignment2.company.reports_generator.factory;

import assignment2.company.models.User;
import assignment2.company.reports_generator.impl.GenerateReportForDirector;
import assignment2.company.reports_generator.impl.GenerateReportForManager;
import assignment2.company.reports_generator.impl.GenerateReportForStaff;
import assignment2.company.reports_generator.intf.IReportGenerator;

public class FactoryReports {
    public static void report(User user) {
        IReportGenerator reportGenerator;
        switch (user.getRole()) {
            case DIRECTOR:
                reportGenerator = new GenerateReportForDirector();
                break;
            case MANAGER:
                reportGenerator = new GenerateReportForManager();
                break;
            case STAFF:
                reportGenerator = new GenerateReportForStaff();
                break;
            default:
                throw new IllegalArgumentException("Unsupported this user type : " + user.getRole());
        }
         reportGenerator.generateReport(user);
    }
}
