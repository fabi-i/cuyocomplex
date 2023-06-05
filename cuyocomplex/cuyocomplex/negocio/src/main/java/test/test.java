/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.cuyocorp.entidad.Unidadaprendizaje;
import mx.cuyocorp.integracion.ServiceFacadeLocator;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        Unidadaprendizaje ua = new Unidadaprendizaje();
        
        ua = ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().identificacion("Desarrollo de software");
        
        if(ua.getNombreUnidad()!= null){
            System.out.println("Nombre de la unidad: " + ua.getNombreUnidad());
        }else{
            System.out.println("No se encontro registro");
        }
    }
}
