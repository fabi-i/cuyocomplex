/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.cuyocorp.DAO.ProfesorDAO;
import mx.cuyocorp.entidad.Profesor;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<Profesor> listaUsuarios = new ArrayList();
        ProfesorDAO usuarioDao = new ProfesorDAO();
        listaUsuarios = usuarioDao.findAll();
        
        for(Profesor p : listaUsuarios){
            System.out.println("Nombre: " + p.getNombreProfesor());
        }
    }
}
