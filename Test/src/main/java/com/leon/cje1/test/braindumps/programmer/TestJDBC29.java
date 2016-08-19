package com.leon.cje1.test.braindumps.programmer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC29 {
    static Connection newConnection = null;

    public static Connection getDBConnection() throws SQLException {
        try (Connection con = DriverManager.getConnection("URL", "username", "password")) {
            newConnection = con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        getDBConnection();
        Statement st = newConnection.createStatement();
        st.executeUpdate("INSERT INTO student VALUES (102, ‘Kelvin’)");
    }
}
