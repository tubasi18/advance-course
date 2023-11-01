package assignment2.company.models;

import assignment2.company.enums.UserTypes;

public abstract class User {
    private int id;
    private String name;
    private int age;
    private double hourlyRate;
    private double completedHours;
    private double budget;
    private final UserTypes role;

    public User(int id, String name, int age, double getHourlyRate, double getCompletedHours, UserTypes role, double budget) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = getHourlyRate;
        this.completedHours = getCompletedHours;
        this.role = role;
        this.budget = 0.0;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getId() {
        return this.id;
    }

    public UserTypes getRole() {
        return this.role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getCompletedHours() {
        return this.completedHours;
    }

    public void setCompletedHours(double completedHours) {
        this.completedHours = completedHours;
    }

    public String toString() {
        return "Role : " + this.role + ", Id = " + this.id + ", Name : " + this.name + ", budget = " + this.budget + "\n";
    }
}
