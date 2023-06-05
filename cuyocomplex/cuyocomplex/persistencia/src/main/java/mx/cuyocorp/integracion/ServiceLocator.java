/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.cuyocorp.integracion;

import mx.cuyocorp.DAO.ProfesorDAO;
import mx.cuyocorp.DAO.UnidadAprendizajeDAO;


/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static ProfesorDAO ProfesorDAO;
    private static UnidadAprendizajeDAO UnidadAprendizajeDAO;
    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static ProfesorDAO getInstanceAlumnoDAO(){
        if(ProfesorDAO == null){
            ProfesorDAO = new ProfesorDAO();
            return ProfesorDAO;
        } else{
            return ProfesorDAO;
        }
    }
    /**
     * se crea la instancia de usuarioDAO si esta no existe
     */
    public static UnidadAprendizajeDAO getInstanceUsuarioDAO(){
        if(UnidadAprendizajeDAO == null){
            UnidadAprendizajeDAO = new UnidadAprendizajeDAO();
            return UnidadAprendizajeDAO;
        } else{
            return UnidadAprendizajeDAO;
        }
    }
    
}
