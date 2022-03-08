package org.example.labs.lab6;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jetbrains.annotations.NotNull;

import java.sql.*;

public class DatabaseService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseService.class);

    public void execute() {
        DBProperties properties = DBProperties.getProperties();
        try(Connection connection = DriverManager.getConnection(
                properties.getUrl(),
                properties.getUser(),
                properties.getPassword())
        ) {
            addStudent(connection, "Имам", "Гаджиев", "БИВТ-20-7");
            addStudent(connection, "Никита", "Безыкорнов", "БИВТ-20-4");
            addStudent(connection, "Максим", "Солопов", "БИВТ-20-3");
            getStudents(connection);
            updateStudent(connection, "Александр", 1);
            transaction(connection, "Тимофей", 1);
            getStudents(connection);
        } catch (SQLException e) {
            LOGGER.info(e.getMessage(), e);
        }
    }

    private void getStudents(@NotNull Connection connection) throws SQLException {
        String query = "SELECT * FROM students";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            try(ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    LOGGER.info(
                            "id: {}, name: {}, surname: {}, group_id: {}",
                            result.getInt("id"),
                            result.getString("name"),
                            result.getString("surname"),
                            result.getString("group_id")
                    );
                }
            }
        }
    }

    private void addStudent(
            @NotNull Connection connection,
            String name,
            String surname,
            String group_id
    ) throws SQLException {
        String query = "INSERT INTO students (name, surname, group_id) VALUES (?, ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, group_id);
            statement.executeUpdate();
        }
    }

    private void updateStudent(@NotNull Connection connection, String name, int id) throws SQLException {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.execute();
        }
    }

    private void transaction(@NotNull Connection connection, String name, int id) throws SQLException {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        connection.setAutoCommit(false);
        try(PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.execute();

            String example = null;
            example.toString();
            connection.commit();
        } catch (RuntimeException e) {
            LOGGER.info("Ошибка {}", e.getMessage());
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
