/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;
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
    
       private static int insertgeneric(String tablename, String[] fieldnames, Class[] fieldtypes, String[] fieldvalues) {
        try {
            // TODO code application logic here

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/midb", "root", "");
            String query = "insert into " + tablename + " ";
            String fn = "(";
            String fv = "(";
            int i = 0;
            for (String fieldname : fieldnames) {
                if (i != 0) {
                    fn += ",";
                    fv += ",";
                }
                fn += fieldname;
                fv += "?";

                i++;
            }

            fn += ") ";
            fv += ") ";

            query += fn + " values " + fv;
            PreparedStatement st = con.prepareStatement(query);

            for (i = 0; i < fieldnames.length; i++) {
                Class fieldtype = fieldtypes[i];
                String fieldvalue = fieldvalues[i];
                if (fieldtype.equals(String.class)) {
                    st.setString(i + 1, fieldvalue);
                } else if (fieldtype.equals(int.class)) {
                    st.setInt(i + 1, Integer.parseInt(fieldvalue));
                }
            }

            return st.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    private static int deletegeneric(String tablename, String[] fieldnames, Class[] fieldtypes, String[] fieldvalues) {
        try {
            // TODO code application logic here

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/midb", "root", "");
            String query = "delete from " + tablename + " where ";
            String condicion = " ";
            int i = 0;
            for (String fieldname : fieldnames) {
                if (i != 0) {
                    condicion += " and ";
                }
                condicion += " "+fieldname+"= ? " ;
                
                i++;
            }          

            query += condicion;
            PreparedStatement st = con.prepareStatement(query);

            for (i = 0; i < fieldnames.length; i++) {
                Class fieldtype = fieldtypes[i];
                String fieldvalue = fieldvalues[i];
                if (fieldtype.equals(String.class)) {
                    st.setString(i + 1, fieldvalue);
                } else if (fieldtype.equals(int.class)) {
                    st.setInt(i + 1, Integer.parseInt(fieldvalue));
                }
            }

            return st.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    private static int updategeneric(String tablename, String[] whereids, Class[] whereClass,String[] wherefieldvalues,  String[] fieldnames, Class[] fieldtypes, String[] fieldvalues) {
       try {
            // TODO code application logic here

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/midb", "root", "");
            String query = "update   " + tablename + " set ";
            String temp = " ";
            int i = 0;
            for (String fieldname : fieldnames) {
                if (i != 0) {
                    temp += " , ";
                }
                temp += " "+fieldname+"= ? " ;
                
                i++;
            }        

            query += temp + " where ";
            
            
             i = 0;
            for (String fieldname : whereids) {
                if (i != 0) {
                    query += " and ";
                }
                query += " "+fieldname+"= ? " ;
                
                i++;
            }  
            
            
            
            PreparedStatement st = con.prepareStatement(query);
            int pp=1;
            for (i = 0; i < fieldnames.length; i++) {
                Class fieldtype = fieldtypes[i];
                String fieldvalue = fieldvalues[i];
                if (fieldtype.equals(String.class)) {
                    st.setString(pp++, fieldvalue);
                } else if (fieldtype.equals(int.class)) {
                    st.setInt(pp++, Integer.parseInt(fieldvalue));
                }
            }
            
            for (i = 0; i < whereids.length; i++) {
                Class fieldtype = whereClass[i];
                String fieldvalue = wherefieldvalues[i];
                if (fieldtype.equals(String.class)) {
                    st.setString(pp++, fieldvalue);
                } else if (fieldtype.equals(int.class)) {
                    st.setInt(pp++, Integer.parseInt(fieldvalue));
                }
            }
            
            
            
             
            

            return st.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;   
    
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
