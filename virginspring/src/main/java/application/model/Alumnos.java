package application.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Alumnos {
    private String cedula;
    private String nombre;
    private String apellido;
    private Date nacimiento;

    @Id
    @Column(name = "cedula")
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "nacimiento")
    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alumnos alumnos = (Alumnos) o;

        if (cedula != null ? !cedula.equals(alumnos.cedula) : alumnos.cedula != null) return false;
        if (nombre != null ? !nombre.equals(alumnos.nombre) : alumnos.nombre != null) return false;
        if (apellido != null ? !apellido.equals(alumnos.apellido) : alumnos.apellido != null) return false;
        if (nacimiento != null ? !nacimiento.equals(alumnos.nacimiento) : alumnos.nacimiento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cedula != null ? cedula.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (nacimiento != null ? nacimiento.hashCode() : 0);
        return result;
    }
}
