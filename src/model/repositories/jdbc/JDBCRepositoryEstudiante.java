/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repositories.jdbc;

import java.util.ArrayList;
import model.JDBCManager;
import model.core.interfaces.IRepositoryEstudiante;
import model.entities.EstudianteEntity;

/**
 *
 * @author PC24
 */
public class JDBCRepositoryEstudiante implements IRepositoryEstudiante{

    @Override
    public int Adicionar(EstudianteEntity eval) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Modificar(int id, EstudianteEntity eval) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EstudianteEntity> getListado() {
        ArrayList<EstudianteEntity> res = new ArrayList<>();
        ArrayList<String[]> tabla = JDBCManager.getlistgeneric("Estudiante",new String[]{"id","cedula","nombre","edad"} , new Class[]{int.class,String.class,String.class,int.class});
         for (String[] row : tabla) {
             EstudianteEntity instance = new EstudianteEntity( Integer.parseInt( row[0]), row[1], row[2], Integer.parseInt( row[3]));
             res.add(instance);
         }
         
         
         return res;
    
    }

    @Override
    public EstudianteEntity getbyID(int id) {
         String[] row = JDBCManager.getrowgeneric("Estudiante",new String[]{"id","cedula","nombre","edad"} , new Class[]{int.class,String.class,String.class,int.class},new String[]{"id"} , new Class[]{int.class},new String[]{String.valueOf(id)});
         EstudianteEntity instance = new EstudianteEntity( Integer.parseInt( row[0]), row[1], row[2], Integer.parseInt( row[3]));
         return instance;
        
    }
    
}
