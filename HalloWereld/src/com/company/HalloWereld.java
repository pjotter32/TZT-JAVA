package com.company;

/**
 * Created by User on 10-5-2017.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class HalloWereld {

    public static void main(String[] args) {
        System.out.println("** De groeten van **");
        executeQuery();
    }

    private static void executeQuery(){
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/database pbs?","root" , "usbw");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM account");

            while(rs.next()){
                System.out.println("Bestelling ID: " + rs.getString("Naam") + " says '" + rs.getString("Woonplaats") + "'");
            }

        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            //  release resources
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
                stmt = null;
            }
        }
    }
}