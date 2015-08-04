/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repositories.jdbc;

import java.util.ArrayList;
import model.core.interfaces.IRepositoryEvaluacion;
import model.entities.EvaluacionEntity;

/**
 *
 * @author PC24
 */
public class JDBCRepositoryEvaluacion implements IRepositoryEvaluacion{

    @Override
    public int Adicionar(EvaluacionEntity eval) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Eliminar(int idEstudiante, int idMateria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Modificar(int idEstudiante, int idMateria, EvaluacionEntity eval) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EvaluacionEntity> getListado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EvaluacionEntity getbyID(int idEstudiante, int idMateria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
