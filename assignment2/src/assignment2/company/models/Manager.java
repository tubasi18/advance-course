package assignment2.company.models;

import assignment2.company.budget_calculater.factory.FactoryBudget;
import assignment2.company.enums.UserTypes;

import java.util.ArrayList;
import java.util.List;

public class Manager extends User {
    private final List<Staff> staffs = new ArrayList<>();

    public Manager(int id, String name, int age, double getHourlyRate, double getCompletedHours, UserTypes role, double budget) {
        super(id, name, age, getHourlyRate, getCompletedHours, role, budget);
    }

    public void addStaff(Staff staff) {
        this.staffs.add(staff);
    }

    public List<Staff> getStaffs() {
        return this.staffs;
    }

    public void generateBudget(User user) {
            user.setBudget(FactoryBudget.budget(user));
    }
}
