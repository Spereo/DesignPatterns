package org.example.labs.lab1.Singleton;

public class Connection {
    private static Connection instance; //инициализируем статичное поле для хранения объекта-одиночки

    private Connection() {} //инициализируем приватный конструктор

    public static Connection getInstance() {
        if (Connection.instance == null)
            Connection.instance = new Connection();
        return Connection.instance;
    }
}
