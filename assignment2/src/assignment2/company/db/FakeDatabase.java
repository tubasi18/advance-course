package assignment2.company.db;

import assignment2.company.models.User;
import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {
    private static FakeDatabase database = null;
    private static List<User> users;

    private FakeDatabase() {
        users = new ArrayList<>();
    }

    public static FakeDatabase getInstance() {
        if (database == null) {

            synchronized(FakeDatabase.class) {
                if (database == null) {
                    database = new FakeDatabase();
                }
            }
        }

        return database;
    }
    public List<User> getUsers() {
        return users;
    }

    public void getUserById(User id) {
        if (users.contains(id)) {
            System.out.println(id.toString());
        }

    }

    public void connect(User user) {
        if (!users.contains(user)) {
            users.add(user);
            System.out.println("Connection opened for user ID: " + user.getId());
        } else {
            System.out.println("Connection already open for user ID: " + user.getId());
        }
    }

    public void close(User user) {
        if (users.contains(user)) {
            users.remove(user);
            System.out.println("Connection closed for user ID: " + user.getId());
        } else {
            System.out.println("No open connection found for user ID: " + user.getId());
        }

    }
}
