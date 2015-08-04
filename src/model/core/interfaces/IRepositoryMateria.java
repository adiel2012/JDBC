/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.core.interfaces;

import java.util.ArrayList;
import model.entities.MateriaEntity;

/**
 *
 * @author PC24
 */
public interface IRepositoryMateria {
    public int Adicionar(MateriaEntity eval);
    public int Eliminar(int id);
    public int Modificar(int id, MateriaEntity eval);
    public ArrayList<MateriaEntity> getListado();
    public MateriaEntity getbyID(int id);
}
