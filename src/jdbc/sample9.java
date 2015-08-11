/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.ArrayList;
import model.JDBCManager;
import model.core.interfaces.IRepositoryEstudiante;
import model.entities.EstudianteEntity;
import model.repositories.jdbc.JDBCRepositoryEstudiante;

/**
 *
 * @author PC_34
 */
public class sample9 {
    public static void main(String[] args) {
         
        ArrayList<String[]> data = JDBCManager.PreparedQuery("select id, product_name from products where id=?", new Class[]{int.class}, new  String[]{"1"} , new Class[]{int.class,String.class});
        for (String[] data1 : data) {
            System.out.println(data1[1]);
        }
    
    }
}
