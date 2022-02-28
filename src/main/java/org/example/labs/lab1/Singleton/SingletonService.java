package org.example.labs.lab1.Singleton;

public class SingletonService {
    public void execute() {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();

        System.out.println(connection1.toString());
        System.out.println(connection2.toString());
    }
}
