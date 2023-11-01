package assignment2.app;

import assignment2.company.db.FakeDatabase;
import assignment2.company.enums.UserTypes;
import assignment2.company.models.Director;
import assignment2.company.models.Manager;
import assignment2.company.models.Staff;

public class Main {
    public static void main(String[] args) {

        FakeDatabase fakeDatabase = FakeDatabase.getInstance();

        Director director = new Director(1,"maher",22,5,10, UserTypes.DIRECTOR,0);
        Manager manager = new Manager(2,"ahmad",30,6,10,UserTypes.MANAGER,0);
        Manager manager1 = new Manager(4,"ahmad",30,6,10,UserTypes.MANAGER,0);
        Staff staff = new Staff(3,"noor",10,8,10,UserTypes.STAFF,0);


        director.addStaff(staff);
        director.addManager(manager1);
        director.addManager(manager);

        director.generateBudget(staff);
        director.generateBudget(manager1);
        director.generateBudget(director);
        director.generateBudget(manager);

        director.generateReport(director);

        fakeDatabase.connect(staff);
        fakeDatabase.connect(manager1);
        fakeDatabase.connect(manager);
        fakeDatabase.connect(director);


        System.out.println(fakeDatabase.getUsers());

        fakeDatabase.close(staff);
        fakeDatabase.close(manager1);
        fakeDatabase.close(manager);
        fakeDatabase.close(director);
    }
}
