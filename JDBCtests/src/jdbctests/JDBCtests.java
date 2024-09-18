/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctests;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Niraj Sangroula
 */
public class JDBCtests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/defaults","root","");
            Statement s = conn.createStatement();
            ResultSet results = s.executeQuery("select * from users");
            while(results.next()){
                System.out.println("Name: "+results.getString("name"));
                System.out.println("Password: "+results.getString("password"));
                System.out.println("Secret Code: "+results.getString("secret_code"));
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }

}
