/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.cuyocorp.facade;

import mx.cuyocorp.delegate.DelegateUnidadAprendizaje;
import mx.cuyocorp.entidad.Unidadaprendizaje;

/**
 *
 * @author EduardoCardona <>
 */
public class FacadeUnidadAprendizaje {
    
    private final DelegateUnidadAprendizaje DelegateUnidadAprendizaje;

    public FacadeUnidadAprendizaje() {
        this.DelegateUnidadAprendizaje = new DelegateUnidadAprendizaje();
    }
    
     /**
     * Metodo para verificar si el usuario esta registrado en la bd
     * @param password 
     * @param correo
     * @return Regresa usuario si el correo y contrasena con correctos
     */
    public Unidadaprendizaje identificacion(String nombre){
        return DelegateUnidadAprendizaje.identification(nombre);
    }
    
    /**
     * Metodo de ejemplo para guardar Usuario
     * @param usuario de tipo usuario con id 0 para poder que se cree un id nuevo
     */
    public void saveUnidadAprendizaje(Unidadaprendizaje ua){
        DelegateUnidadAprendizaje.saveUnidadAprendizaje(ua);
    }
    
}
