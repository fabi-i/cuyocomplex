package mx.cuyocorp.ui;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.cuyocorp.entidad.Unidadaprendizaje;
import mx.cuyocorp.helper.LoginHelper;

/**
 * Esta clase se encarga de tomar los valores de la página web y manejar los eventos generados por los usuarios.
 */
@ManagedBean(name = "loginUI")
@SessionScoped
public class LoginBeanUI implements Serializable{
    private LoginHelper loginHelper;
    private Unidadaprendizaje ua;
    
    public LoginBeanUI() {
        loginHelper = new LoginHelper();
    }
    
    /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
    @PostConstruct
    public void init(){
        ua= new Unidadaprendizaje();
    }

     public void IdUA() throws IOException{
        String appURL = "/index.xhtml";
        // los atributos de usuario vienen del xhtml 
        Unidadaprendizaje ua= new Unidadaprendizaje();
        
        //us.setIdUnidad(Integer.SIZE);
        ua = loginHelper.IdUA(ua.getNombreUnidad());
          if(ua != null && ua.getIdUnidad()!=null){
            // asigno el usuario encontrado al usuario de esta clase para que 
            // se muestre correctamente en la pagina de informacion
            ua=ua;
            FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + appURL);
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrecta:", "Intente de nuevo"));          
        }
    }

    
    /* getters y setters*/
    public Unidadaprendizaje getUA() {
        return ua;
    }

    public void setUA(Unidadaprendizaje Unidadaprendizaje) {
        this.ua = Unidadaprendizaje;
    }
    
    
    
    
    
    
    
    

    

    
}
