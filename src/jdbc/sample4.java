/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adiel
 */
public class sample4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/" + JDBC.basedatos, JDBC.usuario, JDBC.clave);
            statement = con.createStatement();

            con.setAutoCommit(false);
            statement.addBatch("INSERT INTO `test`.`products` (\n"
                    + "`id` ,\n"
                    + "`product_name` ,\n"
                    + "`stock_qty` ,\n"
                    + "`price` ,\n"
                    + "`product_description`\n"
                    + ")\n"
                    + "VALUES (\n"
                    + "NULL , 'tomate', '5', '3.4', 'mi descripción'\n"
                    + ");");
            statement.addBatch("INSERT INTO `test`.`products` (\n"
                    + "`id` ,\n"
                    + "`product_name` ,\n"
                    + "`stock_qty` ,\n"
                    + "`price` ,\n"
                    + "`product_description`\n"
                    + ")\n"
                    + "VALUES (\n"
                    + "NULL , 'tomate', '5', '3.4', 'mi descripción'\n"
                    + ");");
            int[] count = statement.executeBatch();
            con.commit();

            statement.close();
            con.close();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(sample4.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
