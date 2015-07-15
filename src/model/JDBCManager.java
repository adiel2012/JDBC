/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Laboratorio 3
 */
public class JDBCManager {

    private String usuario = "root";
    private String clave = "";
    private String basedatos = "test";

    private JDBCManager __instance = new JDBCManager();

    private JDBCManager() {

    }
    
    public int InsertPreparedStatement(String tablename,String[] fieldnames,String[] fieldvalues){
        String query = "";
        return UpdatePreparedStatement(fieldnames, fieldvalues, query);
    }
    
    public int UpdatePreparedStatement(String tablename,String[] fieldnames,String[] fieldvalues){
        String query = "";
        return UpdatePreparedStatement(fieldnames, fieldvalues, query);
    }
    
    public int UpdatePreparedStatement(String[] fieldnames,String[] fieldvalues,String query){
        return -1;
    }
    
    public int ExecuteQuery(String sql){
        return -1;
    }
    
    

    public JDBCManager getInstance() {
        if (__instance == null) {
            __instance = new JDBCManager();
        }
        return __instance;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the basedatos
     */
    public String getBasedatos() {
        return basedatos;
    }

    /**
     * @param basedatos the basedatos to set
     */
    public void setBasedatos(String basedatos) {
        this.basedatos = basedatos;
    }
}
