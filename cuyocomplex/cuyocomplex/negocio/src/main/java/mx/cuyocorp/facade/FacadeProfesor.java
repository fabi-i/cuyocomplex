/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.cuyocorp.facade;

import mx.cuyocorp.delegate.DelegateProfesor;
import mx.cuyocorp.entidad.Profesor;

public class FacadeProfesor {
    
    private final DelegateProfesor delegateProfesor;

    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }
    
    public void guardarAlumno(Profesor profesor){
        delegateProfesor.saveProfesor(profesor);
    }
    
}
