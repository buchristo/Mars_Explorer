package com.codecool.marsexploration.mapexplorer.repository.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionManager {
    private static final String JDBC_URL = "jdbc:sqlite:src/main/resources/dbs/MarsExploration.db";

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL);
            createTableIfNotExists(connection);
            System.out.println("Connection to database successfully created...");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void createTableIfNotExists(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS logs (" +
                    "id INTEGER PRIMARY KEY," +
                    "timestamp TEXT NOT NULL UNIQUE," +
                    "number_of_steps INTEGER NOT NULL," +
                    "minerals INTEGER NOT NULL," +
                    "water INTEGER NOT NULL," +
                    "successful_outcome INTEGER NOT NULL)";
            statement.executeUpdate(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
