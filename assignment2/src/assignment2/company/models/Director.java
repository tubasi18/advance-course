package assignment2.company.models;

import assignment2.company.budget_calculater.factory.FactoryBudget;
import assignment2.company.enums.UserTypes;
import assignment2.company.reports_generator.factory.FactoryReports;

import java.util.ArrayList;
import java.util.List;

public class Director extends User {
    private final List<Manager> managers = new ArrayList();
    private final List<Staff> staffs = new ArrayList();

    public Director(int id, String name, int age, double getHourlyRate, double getCompletedHours, UserTypes role, double budget) {
        super(id, name, age, getHourlyRate, getCompletedHours, role, budget);
    }

    public void addManager(Manager manager) {
        this.managers.add(manager);
    }

    public List<Manager> getManagers() {
        return this.managers;
    }

    public List<Staff> getStaffs() {
        return this.staffs;
    }

    public void addStaff(Staff staff) {
        this.staffs.add(staff);
    }

    public void generateBudget(User user) {
        user.setBudget(FactoryBudget.budget(user));
    }

    public void generateReport(User user) {
        FactoryReports.report(user);
    }
}
