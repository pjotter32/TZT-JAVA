/**
 * Created by User on 12-5-2017.
 */
package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Created by pjott on 11-5-2017.
 */
public class StatusVeranderen extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl2 = new JLabel("Volledige naam:  ");
    JLabel jl1 = new JLabel("Bestelling nummber: ");
    JFrame jf = new JFrame();
    JTextField jt1 = new JTextField(30);
    JTextField jt2 = new JTextField(30);
    public StatusVeranderen() {
        setTitle("Titel");
        setSize(1920, 1080);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        //jp = new JPanel();
        //jp2 = new JPanel();
        //jp.add(jl);
        //jt = new JTextField("Please enter all your shit in here");
        jp.add(jl1);
        jp.add(jt1);
        jp.add(jl2);
        jp.add(jt2);
        jt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bestellingNummer = jt1.getText();
                String naam = jt2.getText();
                executeQuery(bestellingNummer, naam);



            }
        });
        //jb = new JButton("Press me");
        //jp.add(jb);
        add(jp);
    }
    public static void main(String[] args){
        StatusVeranderen d = new StatusVeranderen();
    }

    private static void executeQuery(String bestellingNummer, String naam){
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            // Get a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/database pbs?","root" , "usbw");

            // Create a statement
            stmt = conn.createStatement();

            // Execute Sql query
            String sql = "Update bestelling Set BestellingGeleverd = 1 Where Bestelling_id = 43 AND Koerier IN (Select Account_id From Account where Naam = 'Peter Pluim'";
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println("Rows affected: " + rowsAffected);
            System.out.println("Update Completed.");

            // Process the result set
            while(rs.next()){
                System.out.println(rs.getString("Bestelling_id") + "    " +  rs.getString("Koerier") + "    " +  rs.getString("Klant") + "    " +  rs.getString("Beginlocatie") + "    "  +  rs.getString("Eindlocatie"));
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
