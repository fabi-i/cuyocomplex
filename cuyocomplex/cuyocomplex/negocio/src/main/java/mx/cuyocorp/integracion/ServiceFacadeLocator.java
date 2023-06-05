/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.cuyocorp.integracion;

import mx.cuyocorp.facade.FacadeProfesor;
import mx.cuyocorp.facade.FacadeUnidadAprendizaje;

public class ServiceFacadeLocator {
    
    private static FacadeProfesor facadeProfesor;
    private static FacadeUnidadAprendizaje facadeUnidadAp;
    
    public static FacadeProfesor getInstanceFacadeProfesor() {
        if (facadeProfesor == null) {
            facadeProfesor = new FacadeProfesor();
            return facadeProfesor;
        } else {
            return facadeProfesor;
        }
    }
    
    public static FacadeUnidadAprendizaje getInstanceFacadeUnidadAprendizaje() {
        if (facadeUnidadAp == null) {
            facadeUnidadAp = new FacadeUnidadAprendizaje();
            return facadeUnidadAp;
        } else {
            return facadeUnidadAp;
        }
    }
}
