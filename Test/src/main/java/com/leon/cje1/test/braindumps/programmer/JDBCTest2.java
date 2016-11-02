package com.leon.cje1.test.braindumps.programmer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
    static Connection newConnection = null;

    public static Connection getDBConnection() throws SQLException {
        try (Connection conn = DriverManager
                .getConnection("jdbc:derby://localhost:1527/dbTest;create=false;user=db;password=db;create=true")) {
            newConnection = conn;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
//        getDBConnection();
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/dbTest;create=false;user=db;password=db");
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO student VALUES (103, 'Kelvin')");
        System.out.println("INSERTADO");
    }
}
