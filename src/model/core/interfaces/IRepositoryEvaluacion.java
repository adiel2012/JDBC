/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.core.interfaces;

import java.util.ArrayList;
import model.entities.EvaluacionEntity;

/**
 *
 * @author PC24
 */
public interface IRepositoryEvaluacion {
    public int Adicionar(EvaluacionEntity eval);
    public int Eliminar(int idEstudiante, int idMateria);
    public int Modificar(int idEstudiante, int idMateria, EvaluacionEntity eval);
    public ArrayList<EvaluacionEntity> getListado();
    public EvaluacionEntity getbyID(int idEstudiante, int idMateria);
}
