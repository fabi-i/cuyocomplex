
package mx.cuyocorp.delegate;

import java.util.List;
import mx.cuyocorp.entidad.Unidadaprendizaje;
import mx.cuyocorp.integracion.ServiceLocator;

public class DelegateUnidadAprendizaje {
    
    /**
     * Metodo para verificar si unidad aprendizaje está registrado en la bd
     */
    
    public Unidadaprendizaje identification(String nombre){
        Unidadaprendizaje unidadAprendizaje = new Unidadaprendizaje();
        List<Unidadaprendizaje> Unidadaprendizaje = ServiceLocator.getInstanceUsuarioDAO().findAll();
        
        for(Unidadaprendizaje ua:Unidadaprendizaje){
            if(ua.getNombreUnidad().equals(nombre)){
                unidadAprendizaje = ua;
            }
        }
        return unidadAprendizaje;
    }
    
    /**
     * Metodo de ejemplo para guardar Unidad de aprendizaje
     * @param usuario de tipo usuario con id 0 para poder que se cree un id nuevo
     */
    public void saveUnidadAprendizaje(Unidadaprendizaje Unidadaprendizaje){
        ServiceLocator.getInstanceUsuarioDAO().save(Unidadaprendizaje);
    }
    
}
