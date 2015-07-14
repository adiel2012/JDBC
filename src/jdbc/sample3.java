/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Adiel
 */
public class sample3 {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/" + JDBC.basedatos, JDBC.usuario, JDBC.clave);
            Statement statement = con.createStatement();

            con.setAutoCommit(false);
            statement.executeUpdate("INSERT INTO `test`.`products` (\n"
                    + "`id` ,\n"
                    + "`product_name` ,\n"
                    + "`stock_qty` ,\n"
                    + "`price` ,\n"
                    + "`product_description`\n"
                    + ")\n"
                    + "VALUES (\n"
                    + "NULL , 'tomate', '5', '3.4', 'mi descripción'\n"
                    + ");");
            statement.executeUpdate("INSERT INTO `test`.`products` (\n"
                    + "`id` ,\n"
                    + "`product_name` ,\n"
                    + "`stock_qty` ,\n"
                    + "`price` ,\n"
                    + "`product_description`\n"
                    + ")\n"
                    + "VALUES (\n"
                    + "NULL , 'tomate', '5', '3.4', 'mi descripción'\n"
                    + ");");
            con.commit();

            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
