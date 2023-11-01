package assignment2.company.models;

import assignment2.company.enums.UserTypes;

public class Staff extends User {
    public Staff(int id, String name, int age, double getHourlyRate, double getCompletedHours, UserTypes role, double budget) {
        super(id, name, age, getHourlyRate, getCompletedHours, role, budget);
    }
}
