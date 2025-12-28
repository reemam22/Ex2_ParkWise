package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccessDBExample {
    public static void main(String[] args) {
        try {
            // Path to your database
            String dbPath = "C:\\Users\\reema\\Downloads\\ParkWise.accdb";

            // Connection URL
            String url = "jdbc:ucanaccess://" + dbPath;

            // Create connection
            Connection conn = DriverManager.getConnection(url);

            // Create statement
            Statement stmt = conn.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT LotID, LotName, Address FROM ParkingLot");

            while (rs.next()) {
                System.out.println("Lot ID: " + rs.getInt("LotID") +
                                   ", Name: " + rs.getString("LotName"));
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

