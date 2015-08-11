/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import model.core.interfaces.IRepositoryEstudiante;
import model.entities.EstudianteEntity;
import model.repositories.jdbc.JDBCRepositoryEstudiante;

/**
 *
 * @author Adiel
 */
public class sample8 {
     public static void main(String[] args) {
         
         IRepositoryEstudiante repo = new JDBCRepositoryEstudiante();
         EstudianteEntity est = repo.getbyID(1);
         System.out.println(est.getNombre());
    }
}
