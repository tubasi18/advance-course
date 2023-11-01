package assignment2.company.budget_calculater.factory;


import assignment2.company.budget_calculater.impl.DirectorBudgetCalculator;
import assignment2.company.budget_calculater.impl.ManagerBudgetCalculator;
import assignment2.company.budget_calculater.impl.StaffBudgetCalculator;
import assignment2.company.budget_calculater.intf.IBudgetCalculator;
import assignment2.company.models.User;

public class FactoryBudget {
    public static double budget(User user) {
        IBudgetCalculator budget;
        switch (user.getRole()) {
            case DIRECTOR:
                budget = new DirectorBudgetCalculator();
                break;
            case MANAGER:
                budget = new ManagerBudgetCalculator();
                break;
            case STAFF:
                budget = new StaffBudgetCalculator();
                break;
            default:
                throw new IllegalArgumentException("Unsupported this user type : " + user.getRole());
        }

        return budget.calculateBudget(user);
    }
}
