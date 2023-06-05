package mx.cuyocorp.helper;

import java.io.IOException;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import mx.cuyocorp.entidad.Profesor;
import mx.cuyocorp.entidad.Unidadaprendizaje;
import mx.cuyocorp.integracion.ServiceFacadeLocator;

/**
 * Esta clase contiene la lógica del bean, accede a la capa de negocios a través del ServiceFacadeLocator.
 */
public class LoginHelper implements Serializable{
   
    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param correo
     * @param password
     * @return 
     */
    /**
     *  Método para comprobar existencia de Unidad Ap[...], llama a instancia de UAFacade
     * @param nombre
     * @return 
     */
    public Unidadaprendizaje IdUA(String nombre){
        return ServiceFacadeLocator.getInstanceFacadeUnidadAprendizaje().identificacion(nombre);
    }
    
    
    
}
