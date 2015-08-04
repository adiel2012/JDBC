/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.core.interfaces;

import java.util.ArrayList;
import model.entities.EstudianteEntity;

/**
 *
 * @author PC24
 */
public interface IRepositoryEstudiante {
    public int Adicionar(EstudianteEntity eval);
    public int Eliminar(int id);
    public int Modificar(int id, EstudianteEntity eval);
    public ArrayList<EstudianteEntity> getListado();
    public EstudianteEntity getbyID(int id);
}
