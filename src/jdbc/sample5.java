/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adiel
 */
public class sample5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/" + JDBC.basedatos, JDBC.usuario, JDBC.clave);
            PreparedStatement p = con.prepareStatement("select * from products where id= ?");
            p.setInt(1, 2);
            ResultSet rs = p.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("product_name");
                float price = rs.getFloat("price");
                System.out.println("Id: " + id + " Name: " + name + ", price: " + price);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
