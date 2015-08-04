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
import model.core.interfaces.IRepositoryEstudiante;
import model.entities.EstudianteEntity;
import model.repositories.jdbc.JDBCRepositoryEstudiante;

/**
 *
 * @author PC24
 */
public class sample7 {
     public static void main(String[] args) {
         
         IRepositoryEstudiante repo = new JDBCRepositoryEstudiante();
         for (EstudianteEntity e : repo.getListado()) {
             System.out.println(e.getNombre());
         }

    }
}
