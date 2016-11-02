package com.leon.cje1.test.braindumps.programmer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager
                    .getConnection("jdbc:derby://localhost:1527/dbTest;create=false;user=db;password=db");

            String query = "Select * FROM Item WHERE ID = 110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID:" + rs.getInt("Id"));
                System.out.println("Description:" + rs.getString("Descrip"));
                System.out.println("Price:" + rs.getDouble("Price"));
                System.out.println("Quantity: " + rs.getInt("Quantity"));
            }
        } catch (SQLException se) {
            System.out.println("Error");
        }
    }
}
