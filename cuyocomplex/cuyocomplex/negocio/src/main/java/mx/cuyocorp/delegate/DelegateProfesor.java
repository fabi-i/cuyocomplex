/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.cuyocorp.delegate;

import mx.cuyocorp.entidad.Profesor;
import mx.cuyocorp.integracion.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateProfesor {
    
    /**
     * Metodo de ejemplo para guardar Alumno
     * @param alumno de tipo usuario con id 0 para que se cree un id nuevo
     */
    public void saveProfesor(Profesor Profesor){
        ServiceLocator.getInstanceAlumnoDAO().save(Profesor);
    }
    
}
