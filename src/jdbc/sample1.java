/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author Adiel
 */
public class sample1 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/"+JDBC.basedatos, JDBC.usuario, JDBC.clave);
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM PRODUCTS");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("product_name");
                float price = rs.getFloat("price");
                System.out.println("Id: "+id+" Name: " + name + ", price: " + price);
            }
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
