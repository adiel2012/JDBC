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
import java.sql.Statement;
import java.util.ArrayList;
import model.JDBCManager;

/**
 *
 * @author PC24
 */
public class sample6 {
     public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String[]> tabla = JDBCManager.getlistgeneric("products",new String[]{"id","product_name"} , new Class[]{int.class,String.class});
         for (String[] row : tabla) {
             System.out.println(row[0]+"   "+row[1] );
         }
    }
}
