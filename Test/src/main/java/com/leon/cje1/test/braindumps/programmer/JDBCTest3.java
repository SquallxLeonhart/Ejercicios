package com.leon.cje1.test.braindumps.programmer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager
                .getConnection("jdbc:derby://localhost:1527/dbTest;create=false;user=db;password=db");
        String query = "SELECT EID FROM EMPLOYEE";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            stmt.executeQuery("SELECT ID FROM CUSTOMER");
            while (rs.next()) {
                // process the results
                System.out.println("Employee ID: " + rs.getInt(1));
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
