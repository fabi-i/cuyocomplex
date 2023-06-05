/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.cuyocorp.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fabiola Iñigo
 */
@Entity
@Table(name = "unidadaprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidadaprendizaje.findAll", query = "SELECT u FROM Unidadaprendizaje u")
    , @NamedQuery(name = "Unidadaprendizaje.findByIdUnidad", query = "SELECT u FROM Unidadaprendizaje u WHERE u.idUnidad = :idUnidad")
    , @NamedQuery(name = "Unidadaprendizaje.findByNombreUnidad", query = "SELECT u FROM Unidadaprendizaje u WHERE u.nombreUnidad = :nombreUnidad")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasClase", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasTaller", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "Unidadaprendizaje.findByHorasLab", query = "SELECT u FROM Unidadaprendizaje u WHERE u.horasLab = :horasLab")})
public class Unidadaprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUnidad")
    private Integer idUnidad;
    @Basic(optional = false)
    @Column(name = "nombreUnidad")
    private String nombreUnidad;
    @Basic(optional = false)
    @Column(name = "horasClase")
    private short horasClase;
    @Basic(optional = false)
    @Column(name = "horasTaller")
    private short horasTaller;
    @Basic(optional = false)
    @Column(name = "horasLab")
    private short horasLab;
    @ManyToMany(mappedBy = "unidadaprendizajeList")
    private List<Profesor> profesorList;

    public Unidadaprendizaje() {
    }

    public Unidadaprendizaje(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Unidadaprendizaje(Integer idUnidad, String nombreUnidad, short horasClase, short horasTaller, short horasLab) {
        this.idUnidad = idUnidad;
        this.nombreUnidad = nombreUnidad;
        this.horasClase = horasClase;
        this.horasTaller = horasTaller;
        this.horasLab = horasLab;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public short getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(short horasClase) {
        this.horasClase = horasClase;
    }

    public short getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(short horasTaller) {
        this.horasTaller = horasTaller;
    }

    public short getHorasLab() {
        return horasLab;
    }

    public void setHorasLab(short horasLab) {
        this.horasLab = horasLab;
    }

    @XmlTransient
    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidad != null ? idUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadaprendizaje)) {
            return false;
        }
        Unidadaprendizaje other = (Unidadaprendizaje) object;
        if ((this.idUnidad == null && other.idUnidad != null) || (this.idUnidad != null && !this.idUnidad.equals(other.idUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.cuyocorp.entidad.Unidadaprendizaje[ idUnidad=" + idUnidad + " ]";
    }
    
}
