package cap.curso.jpa.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String apellidos;

    @Column
    private String dni;

    @Column(name = "fecha_alta")
    private String fechaAlta;

    @Column(name = "fecha_baja")
    private String fechaBaja;

    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @Column
    private String clave;

    @ManyToMany
    @JoinTable(name = "empledo_jornadas", joinColumns = @JoinColumn(name = "empleados_id"), inverseJoinColumns = @JoinColumn(name = "jornadas_id"))
    private List<Jornada> jornadas;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellidos() {
	return apellidos;
    }

    public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
    }

    public String getDni() {
	return dni;
    }

    public void setDni(String dni) {
	this.dni = dni;
    }

    public String getFechaAlta() {
	return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
	this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
	return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
	this.fechaBaja = fechaBaja;
    }

    public Usuario getUsuario() {
	return usuario;
    }

    public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
    }

    public String getClave() {
	return clave;
    }

    public void setClave(String clave) {
	this.clave = clave;
    }

    public List<Jornada> getJornadas() {
	return jornadas;
    }

    public void setJornadas(List<Jornada> jornadas) {
	this.jornadas = jornadas;
    }

}
