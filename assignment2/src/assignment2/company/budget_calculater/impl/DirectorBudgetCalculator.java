package assignment2.company.budget_calculater.impl;

import assignment2.company.budget_calculater.intf.IBudgetCalculator;
import assignment2.company.models.User;

public class DirectorBudgetCalculator implements IBudgetCalculator {

    public double calculateBudget(User user) {
        double totalBudget = 0.0;
        totalBudget += user.getHourlyRate() * user.getCompletedHours() * 2.0;
        return totalBudget;
    }
}
